package Question;

import BinaryTree1.BinaryTreeNode;

public class NoOfNodes {
	
	public static int noOfNodes(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		int leftCount=noOfNodes(root.left);
		int rightCount=noOfNodes(root.right);
		return leftCount+rightCount+1;
	}
	
	

}
