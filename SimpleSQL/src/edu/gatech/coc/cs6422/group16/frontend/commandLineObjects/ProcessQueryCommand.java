package edu.gatech.coc.cs6422.group16.frontend.commandLineObjects;

import edu.gatech.coc.cs6422.group16.algebraTree.RelationalAlgebraTree;
import edu.gatech.coc.cs6422.group16.algebraTree.treeVisualization.SwingRelationAlgebraTree;
import edu.gatech.coc.cs6422.group16.executionConfiguration.ExecutionConfig;
import edu.gatech.coc.cs6422.group16.heuristics.CartesianToJoin;
import edu.gatech.coc.cs6422.group16.heuristics.PushSelectionDown;
import edu.gatech.coc.cs6422.group16.heuristics.ReorderJoinByCost;
import edu.gatech.coc.cs6422.group16.metaDataRepository.MetaDataRepository;
import edu.gatech.coc.cs6422.group16.statistics.Statistics;
import edu.gatech.coc.cs6422.group16.statistics.TimerType;

import java.io.IOException;
import java.util.List;

public abstract class ProcessQueryCommand implements ICommandLineObject
{
    private static void optimizeQueries(List<RelationalAlgebraTree> trees)
    {
        if (trees != null)
        {
            ExecutionConfig config = ExecutionConfig.getInstance();
            Statistics stat = Statistics.getInstance();
            if (config.isEnableHeuristics())
            {
                stat.start(TimerType.OPTIMIZATION);
                for (RelationalAlgebraTree singleTree : trees)
                {
                    PushSelectionDown.pushSelectionDown(singleTree);
                    CartesianToJoin.cartesianToJoin(singleTree);
                    
                    //we need this either here or inside reorderjoinbycost function because
                    //after doing the cartesiantojoin optimization, the new join node has no cost. 
                    //One could argue that we can put it within the cartesiantojoin function, 
                    //but I leave it up to thee. 
                    allComputeSize(singleTree);	
                     
                    ReorderJoinByCost.reorderJoinByCost(singleTree);
                }
                stat.stop(TimerType.OPTIMIZATION);
            }

            // add all trees to statistics-module:
            for (RelationalAlgebraTree singleTree : trees)
            {
                stat.addQueryTree(singleTree);
            }
        }
    }
    
    private static void calculateEstimatedSize(List<RelationalAlgebraTree> trees)
    {
    	if (trees != null)
        {
    		 for (RelationalAlgebraTree singleTree : trees)
             {
    			 allComputeSize(singleTree);
             }
        }
    	
    }

    private static void allComputeSize (RelationalAlgebraTree current)
    {
        for (RelationalAlgebraTree child : current.getChildren())
        {
        	allComputeSize(child);
        }
        current.computeSize(); // computes estimated size and saves it into the variable estimatedSize, accessible via getter and setter methods
        
    }
    
    @Override
    public void execute()
    {
        ExecutionConfig config = ExecutionConfig.getInstance();

        Statistics stat = Statistics.getInstance();
        stat.start(TimerType.FULL);
        List<RelationalAlgebraTree> trees = null;
        try
        {
            trees = this.parseTree();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        MetaDataRepository.GetInstance().ReadData();

        // only continue on valid trees:
        if (trees != null)
        {
        	//calculateEstimatedSize(trees);
        	
            if (config.isShowVisualTrees() && config.isShowVisualFirstTree())
            {
                RelationalAlgebraTree t0 = trees.get(0).copyNode();
                allComputeSize(t0);
                SwingRelationAlgebraTree.showInDialog(t0, "First tree - Unoptimized");
            }

            optimizeQueries(trees);

            if (config.isShowVisualTrees() && config.isShowVisualFirstTree())
            {
                RelationalAlgebraTree t1 = trees.get(0).copyNode();
                allComputeSize(t1);
                SwingRelationAlgebraTree.showInDialog(t1, "First tree - Optimized");
            }

            stat.stop(TimerType.FULL);
            stat.print();
        }

        // clean-up after we are done:
        stat.reset();
    }

    @Override
    public String longHelp()
    {
        return null;
    }

    @Override
    public boolean providesLongHelp()
    {
        return false;
    }

    @Override
    public boolean providesShortHelp()
    {
        return true;
    }

    protected abstract List<RelationalAlgebraTree> parseTree() throws IOException;
}
