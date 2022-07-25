package BinaryTree1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {


	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData=s.nextInt();

		if(rootData==-1) {
			return null;
		}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);

		Queue<BinaryTreeNode<Integer>> pandingChildren=new LinkedList<>();

		pandingChildren.add(root);

		while(!pandingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front =pandingChildren.poll();
			System.out.println("Enter left child of "+ front.data);
			int left=s.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pandingChildren.add(leftChild);
			}
			
			System.out.println("Enter right child of "+ front.data);
			int right=s.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pandingChildren.add(rightChild);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= takeInput();
		PrintTree.printTree2(root);
	}

}
