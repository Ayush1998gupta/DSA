package Question;

import BinaryTree1.BinaryTreeNode;

public class NOOfLeafNodes {
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		if(root.left==null&&root.right==null) {
			return 1;
		}
		
		int rightCount=noOfLeafNodes(root.left);
		int leftCount=noOfLeafNodes(root.right);
		
		
		
		return rightCount+leftCount;
	}

}
