package Tree;


public class Basic {

	public static void main(String[] args) {
		TreeNode<Integer> root =new TreeNode<Integer>(4);
		TreeNode<Integer> root1 =new TreeNode<Integer>(2);
		TreeNode<Integer> root2 =new TreeNode<Integer>(3);
		TreeNode<Integer> root3 =new TreeNode<Integer>(1);
		TreeNode<Integer> root4 =new TreeNode<Integer>(5);
		TreeNode<Integer> root5 =new TreeNode<Integer>(6);
		
		root.children.add(root1);
		root.children.add(root2);
		root.children.add(root3);
		
		root2.children.add(root4);
		root2.children.add(root5);
		
		Printtree.printTree2(root);

	}

}
