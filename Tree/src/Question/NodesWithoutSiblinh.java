package Question;

import BinaryTree1.BinaryTreeNode;

public class NodesWithoutSiblinh {
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		
		
		if(root.left==null&&root.right!=null) {
			System.out.println(root.right.data);
		}else if(root.left!=null&&root.right==null) {
			System.out.println(root.left.data);
		}
		

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}

}
