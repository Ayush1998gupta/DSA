package Question2;

import BinaryTree1.BinaryTreeNode;

public class MirrorBinaryTree {
	
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	}

}
