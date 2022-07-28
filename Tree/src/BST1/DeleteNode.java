package BST1;

import BinaryTree1.BinaryTreeNode;

public class DeleteNode {
	public static DeleteReturn deleteNode(BinaryTreeNode<Integer>root ,int data) {
		if(root==null) {
			return new DeleteReturn(null, false);
		}

		if(root.data<data) {
			DeleteReturn outputRight=deleteNode(root.right, data);
			root.right=outputRight.root;
			outputRight.root=root;
			return outputRight;
		}
		if(root.data>data) {
			DeleteReturn outputLeft=deleteNode(root.left, data);
			root.left=outputLeft.root;
			outputLeft.root=root;
			return outputLeft;
		}

		if(root.left==null && root.right==null) {
			return new DeleteReturn(null, true);
		}

		if(root.left!=null && root.right==null) {
			return new DeleteReturn(root.left, true);
		}
		if(root.left==null && root.right!=null) {
			return new DeleteReturn(root.right, true);
		}

		//		both child are present
		int rightMin=nodeWithMinimumData(root.right);
		root.data=rightMin;
		
		DeleteReturn outputRight= deleteNode(root.right, rightMin);
		root.right=outputRight.root;
		
		return new DeleteReturn(root, true);

	}

	private static int nodeWithMinimumData(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return Integer.MAX_VALUE;
		}

		return Math.min(root.data, Math.min(nodeWithMinimumData(root.left)
				, nodeWithMinimumData(root.right)));
	}

}

class DeleteReturn{
	BinaryTreeNode<Integer> root;
	boolean deleted;

	public DeleteReturn(BinaryTreeNode<Integer> root,boolean deleted) {
		this.root=root;
		this.deleted=deleted;
	}
}
