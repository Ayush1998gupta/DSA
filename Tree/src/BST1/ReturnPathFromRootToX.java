package BST1;

import java.util.ArrayList;

import BinaryTree1.BinaryTreeNode;

public class ReturnPathFromRootToX {

	
//	It is for any tree not only BST
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput=nodeToRootPath(root.left, x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOuput=nodeToRootPath(root.right, x);
		if(rightOuput!=null) {
			rightOuput.add(root.data);
			return rightOuput;
		}
		
		return null;
	}
}
