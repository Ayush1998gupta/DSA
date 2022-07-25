package BinaryTree1;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= TakeInputLevelWise.takeInput();
		printLevelWise(root);
	}

}
