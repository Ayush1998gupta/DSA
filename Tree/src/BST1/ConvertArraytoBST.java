package BST1;

import BinaryTree1.BinaryTreeNode;

public class ConvertArraytoBST {
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int start,int end){
		if(start>end) {
			return null;
		}
		
		int mid=(start+end)/2;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
		
		BinaryTreeNode<Integer>left=  SortedArrayToBST(arr,start,mid-1);
		BinaryTreeNode<Integer>right=  SortedArrayToBST(arr, mid+1,end);
		
		root.left=left;
		root.right=right;
		
		return root;
	}

}
