package Question2;

import BinaryTree1.BinaryTreeNode;
import Question.HeightOfTree;

public class BalancedBinaryTree {
	
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		
		int leftHeigth=HeightOfTree.heightOfTree(root.left);
		int rightHeight=HeightOfTree.heightOfTree(root.right);
		
		if(Math.abs(rightHeight-leftHeigth)>1) {
			return false;
		}
		
		boolean isLeftBalanced=isBalanced(root.left);
		boolean isRightBalanced=isBalanced(root.right);
		
		return isLeftBalanced&&isRightBalanced;
	}
	
	
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			BalancedTreeReturn ans=new BalancedTreeReturn();
			ans.height=0;
			ans.isbalnaced=true;
			return ans;
		}
		BalancedTreeReturn ans=new BalancedTreeReturn();
		boolean isBal=true;
//		recursion on left and right
		BalancedTreeReturn leftOutput=isBalancedBetter(root.left);
		BalancedTreeReturn rightOutput=isBalancedBetter(root.right);
		
		if(Math.abs(rightOutput.height-leftOutput.height)>1) {
			isBal=false;
		}
	
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		
		if(!leftOutput.isbalnaced || !rightOutput.isbalnaced) {
			isBal=false;
		}
		
		ans.height=height;
		
		ans.isbalnaced=isBal;
		return ans;
		
	}
	

}
