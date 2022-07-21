package Question;

import BinaryTree1.BinaryTreeNode;

public class ReplaceAt_K {

	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepthTree(root,0);
	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int i) {
		if(root==null){
			return;
		}
		
		changeToDepthTree(root.left, i+1);
		changeToDepthTree(root.right, i+1);
		
		root.data=i;
		
	}
}
