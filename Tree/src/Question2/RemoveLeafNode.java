package Question2;

import BinaryTree1.BinaryTreeNode;

public class RemoveLeafNode {
	
	public static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root){
		if(root==null){
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		
		BinaryTreeNode<Integer> leftRoot= removeLeafNode(root.left);
		BinaryTreeNode<Integer> rightRoot=removeLeafNode(root.right);
		
		root.left=leftRoot;
		root.right=rightRoot;
		
		return root;
	}

}
