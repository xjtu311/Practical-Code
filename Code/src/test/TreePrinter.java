package test;
import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}


public class TreePrinter {
	
    public int[][] printTree(TreeNode root) {
        // write code here
    	ArrayList<ArrayList> result = new ArrayList(); //全部的结果
    	ArrayList child = new ArrayList();        //每层的结果
    	LinkedList<TreeNode> tree = new LinkedList();  

    	
    	if(root == null)
    		return null;
    	TreeNode last = root;
    	TreeNode nlast = null;
    	TreeNode temp = null;
    	
    	while(tree.size()>0){
    		
    		temp = tree.poll();
    		
    		child.add(temp.val);
	    	if(temp.left != null){
	    		nlast = temp.left;
	    		child.add(temp.left);
	    	}
	    	if(temp.right != null){
	    		nlast = temp.right;
	    		child.add(temp.right);
	    	}
	    	if(temp == last){
	    		last =nlast;
	    		result.add(child);
	    		child = new ArrayList();
	    	}
    	
    	}
    	
    	int[][] res = new int[result.size()][];
    	
    	for (int i = 0; i < res.length; i++) {
			child = result.get(i);
			res[i] = new int[child.size()];
			
			for (int j = 0; j < child.size(); j++) {
				res[i][j] = (int) child.get(j);
				
			}
		}
    	
    	return res;
    }
    
}