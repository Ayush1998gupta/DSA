package Question;

import BinaryTree1.BinaryTreeNode;
import BinaryTree1.PrintTree;
import BinaryTree1.TakeInput;

public class NodeWithLargestData {
	public static int nodeWithLargestData(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return -1;
		}
		
		return Math.max(root.data, Math.max(nodeWithLargestData(root.left)
				, nodeWithLargestData(root.right)));
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=TakeInput.takeInputBetter(true, 0, false);
		PrintTree.printTree2(root);
		System.out.println(nodeWithLargestData(root));
	}

}

