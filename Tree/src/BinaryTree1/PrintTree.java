package BinaryTree1;

public class PrintTree {
	
	public static void printTree1(BinaryTreeNode<Integer> root) {
//		Base Case
		if(root==null) {
			return;
		}
		
		System.out.println(root.data);

//		Recursion
		printTree1(root.left);
		printTree1(root.right);
	}
	
	
	
	public static void printTree2(BinaryTreeNode<Integer> root) {
//		Base Case
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+ ": ");
		
		if(root.left!=null) {
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();

//		Recursion
		printTree2(root.left);
		printTree2(root.right);
	}
	
	

}
