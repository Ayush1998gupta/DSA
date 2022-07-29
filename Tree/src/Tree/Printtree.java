package Tree;

public class Printtree {

	public static void printTree(TreeNode<Integer> root) {

		if(root==null) {
			return;
		}

		System.out.print(root.data+" ");

		for (int i = 0; i < root.children.size(); i++) {
			printTree(root.children.get(i));
		}
	}

	public static  void printTree2(TreeNode<Integer> root){
		if(root==null) {
			return;
		}

		System.out.print(root.data+ ": ");

		for (int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data +", ");
		}

		System.out.println();

		//		Recursion
		for (int i = 0; i < root.children.size(); i++) {
			printTree2(root.children.get(i));
		}
	}

}
