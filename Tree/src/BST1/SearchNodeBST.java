package BST1;

import BinaryTree1.BinaryTreeNode;

public class SearchNodeBST {
	
	public static boolean search(BinaryTreeNode<Integer>root,int x){
		
		if(root==null) {
			return false;
		}
		boolean ans;
		if(root.data==x) {
			return true;
		}
		else if(root.data>x) {
			ans =search(root.left, x);
		}else {
			ans=search(root.right, x);
		}
		return ans;
	}

}
