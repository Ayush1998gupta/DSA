package BST1;

import BinaryTree1.BinaryTreeNode;

public class InsertNode {

	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer>root,int data){
		if(root==null) {
			BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<Integer>(data);
			return newRoot;
		}
		if(data>=root.data) {
			root.right= insert(root.right,data);
		}else{
			root.left= insert(root.left,data);
		}
		return root;
	}
}
