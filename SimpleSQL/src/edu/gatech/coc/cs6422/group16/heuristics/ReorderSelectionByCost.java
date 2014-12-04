package edu.gatech.coc.cs6422.group16.heuristics;

import edu.gatech.coc.cs6422.group16.algebraTree.*;
import edu.gatech.coc.cs6422.group16.metaDataRepository.MetaDataRepository;

public class ReorderSelectionByCost
{
    public static void pushSelectionDown(RelationalAlgebraTree root) throws IllegalArgumentException
    {
    	if (root == null || root.getChildCount() == 0)
    		return;
    	
    	// Get left child
    	RelationalAlgebraTree c1 = root.getChildren().get(0);

      	// If this is a select node with a select node child 
      	SelectNode rootSel = root.getCurrentNodeAs(SelectNode.class);
      	SelectNode childSel = c1.getCurrentNodeAs(SelectNode.class);
      	if (rootSel != null)
        	if (childSel != null) {
        		MetaDataRepository meta = MetaDataRepository.GetInstance();
        	    double rootSelFactor = meta.GetDistinctValueOfAttribute(rootSel.getField());
        	    double childSelFactor = meta.GetDistinctValueOfAttribute(childSel.getField());
        	    
        		if (rootSelFactor < childSelFactor) {
	
	                // get nodes above and below
	                RelationalAlgebraTree parent = root.getParent();
	                RelationalAlgebraTree c1Child = null;
	                if (c1.getChildCount() > 0)
	                	c1Child = c1.getChildren().get(0);
	                
	                // break all ties below
	                parent.removeChild(rootSel);
	                root.removeChild(c1);
	                if (c1Child != null)
	                	c1.removeChild(c1Child);
	                
	                // re-establish all ties
	                parent.addChild(c1);
	                c1.addChild(root);
	                root.addChild(c1Child);
	                
	                c1 = root;
        		}
        	}
        	
        // Run DFS on left and right sub trees
        pushSelectionDown(c1);
    	if (root.getChildCount() == 2) {
	    	RelationalAlgebraTree c2 = root.getChildren().get(1);
        	pushSelectionDown(c2);			
    	}
    }
}

