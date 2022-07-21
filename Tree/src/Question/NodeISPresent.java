package Question;

import BinaryTree1.BinaryTreeNode;

public class NodeISPresent {
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root ,int x) {
		
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		
		boolean left=isNodePresent(root.left, x);
		boolean right=isNodePresent(root.right, x);
		
		
		return left || right;
	}

}
