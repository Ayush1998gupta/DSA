package BinaryTree1;

import java.util.Scanner;

public class TakeInput {

	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter Root Data");
		Scanner s= new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData== -1) {
			return null;
		}

		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(rootData);

		//		Recursion call on left
		BinaryTreeNode<Integer> leftChild=takeInput();

		//		Recursion call on right
		BinaryTreeNode<Integer> rightChild=takeInput();

		root.left=leftChild;
		root.right=rightChild;

		return root;
	}


	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter Root Data");
		}else {
			if(isLeft) {
				System.out.println("Enter Left Child of "+parentData);
			}else {
				System.out.println("Enter Right Child of "+parentData);
			}
		}
		Scanner s= new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData== -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		//		Recursion call on left
		BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData, true);

		//		Recursion call on right
		BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData, false);

		root.left=leftChild;
		root.right=rightChild;

		return root;
	}


}
