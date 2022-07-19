package BinaryTree1;

public class Basic {

	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(10);
//		
//		BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(20);
//		BinaryTreeNode<Integer> rootRigth=new BinaryTreeNode<>(30);
//		root.left=rootLeft;
//		root.right=rootRigth;
//		
//		
//		
//		BinaryTreeNode<Integer> twoRigth=new BinaryTreeNode<>(40);
//		BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<>(50);
//		
//		rootLeft.right=twoRigth;
//		rootRigth.left=threeLeft;
		
		BinaryTreeNode<Integer> root= TakeInput.takeInputBetter(true, 0, true);
		PrintTree.printTree2(root);
		
	}

}
