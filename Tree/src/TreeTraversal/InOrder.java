package TreeTraversal;

import BinaryTree1.BinaryTreeNode;

public class InOrder {
	public static void inOrder(BinaryTreeNode<Integer> root){
		if(root==null) {
			return;
		}

		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
		
	}

}
