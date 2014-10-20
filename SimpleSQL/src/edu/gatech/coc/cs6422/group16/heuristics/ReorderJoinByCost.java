package edu.gatech.coc.cs6422.group16.heuristics;

import edu.gatech.coc.cs6422.group16.algebraTree.*;

import java.util.ArrayList;
import java.util.List;

public class ReorderJoinByCost 
{

	public static void reorderJoinByCost(RelationalAlgebraTree root)
	{
	
        List<JoinNode> joinNodes = new ArrayList<>();
        
        //Get all of them to compute cost/size first
        //allComputeSize(root);
        
        // Get all the join nodes we need to process
        getAllNodesOfType(root, JoinNode.class, joinNodes);	
        
        // Process each of the JoinNodes to reorder its children by cost
        // iterate through the joinNodes array list and run the function
        for (JoinNode child : joinNodes)
        {
            child.reorderChildrenBasedOnCost();
        }
		
	}
	
	private static <T extends RelationalAlgebraTree> void getAllNodesOfType(RelationalAlgebraTree current,
            Class<? extends T> classType, List<T> nodeList)
    {
        if (current.isClass(classType))
        {
            nodeList.add(current.getCurrentNodeAs(classType));
        }
        for (RelationalAlgebraTree child : current.getChildren())
        {
            getAllNodesOfType(child, classType, nodeList);
        }
        
        // make all nodes calculate their cost and save it
        //current.computeSize(); //we need to do it again because after some of the optimizations (cartesian product to join), the sizes are lost/changed.
    }
	
	private static void allComputeSize (RelationalAlgebraTree current)
    {
        for (RelationalAlgebraTree child : current.getChildren())
        {
        	allComputeSize(child);
        }
        current.computeSize(); // computes estimated size and saves it into the variable estimatedSize, accessible via getter and setter methods
        
    }
	
}

