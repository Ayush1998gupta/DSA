package Question;

import BinaryTree1.BinaryTreeNode;

public class PrintNodeAtDepth_K {
	
	
	public static void printAt_k(BinaryTreeNode<Integer> root,int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		printAt_k(root.left, k-1);
		printAt_k(root.right, k-1);
	}

}
