package Question;

import BinaryTree1.BinaryTreeNode;

public class HeightOfTree {

	public static int heightOfTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int rightHeight=heightOfTree(root.left);
		int leftHeight=heightOfTree(root.right);
		
		if(rightHeight>leftHeight) {
			return rightHeight+1;
		}else {
			return leftHeight+1;
		}
	}
}
