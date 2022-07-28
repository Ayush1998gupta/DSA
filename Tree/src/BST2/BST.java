package BST2;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree1.BinaryTreeNode;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;

	public boolean isPresent(int x) {
		return  isPresentHelper(root, x);
	}

	private static boolean isPresentHelper(BinaryTreeNode<Integer>root,int x){

		if(root==null) {
			return false;
		}
		boolean ans;
		if(root.data==x) {
			return true;
		}
		else if(root.data>x) {
			ans =isPresentHelper(root.left, x);
		}else {
			ans=isPresentHelper(root.right, x);
		}
		return ans;
	}

	public void insert(int x) {
		root=insertHelper(root, x);
		size++;
	}
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer>root,int data){
		if(root==null) {
			BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<Integer>(data);
			return newRoot;
		}
		if(data>=root.data) {
			root.right= insertHelper(root.right,data);
		}else{
			root.left= insertHelper(root.left,data);
		}
		return root;
	}

	public boolean deleteData(int data) {
		DeleteReturn output=deleteDataHelper(root, data);
		root=output.root;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}
	
	private static DeleteReturn deleteDataHelper(BinaryTreeNode<Integer>root ,int data) {
		if(root==null) {
			return new DeleteReturn(null, false);
		}

		if(root.data<data) {
			DeleteReturn outputRight=deleteDataHelper(root.right, data);
			root.right=outputRight.root;
			outputRight.root=root;
			return outputRight;
		}
		if(root.data>data) {
			DeleteReturn outputLeft=deleteDataHelper(root.left, data);
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
		int rightMim=nodeWithMinimumData(root.right);
		root.data=rightMim;
		
		DeleteReturn outputRight= deleteDataHelper(root.right, rightMim);
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


	public int size() {
		return size;
	}

	public void prinTree() {
		prinTreeHelper(root);
	}
	private static void prinTreeHelper(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingChildern= new LinkedList<>();
		pendingChildern.add(root);

		while(!pendingChildern.isEmpty()) {
			BinaryTreeNode<Integer> front =pendingChildern.poll();
			System.out.print(front.data);
			if(front.left!=null) {
				System.out.print(":L:"+front.left.data);
				pendingChildern.add(front.left);
			}else {
				System.out.print(":L:");
			}
			if(front.right!=null) {
				System.out.println(",R:"+front.right.data);
				pendingChildern.add(front.right);
			}else {
				System.out.println(",R:");
			}


		}
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
