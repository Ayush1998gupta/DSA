package Question2;

import BinaryTree1.BinaryTreeNode;
import Question.HeightOfTree;

public class DiameterOfBinaryTree {
	
	public static int diameterBinaryTree(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		
		int leftHeight=HeightOfTree.heightOfTree(root.left);
		int rightHeight=HeightOfTree.heightOfTree(root.right);
		
		int leftOutput=diameterBinaryTree(root.left);
		int rightOutput=diameterBinaryTree(root.right);
		
		
		int max=Math.max(leftOutput, 
				Math.max(rightHeight+leftHeight+1, rightOutput));
		
		return max;
	}
	
	 public static  Diameterclass diameterofBinary(BinaryTreeNode<Integer> root){
		 if(root==null) {
			 Diameterclass ans=new Diameterclass(0,0);
			 return ans;
		 }
		 
//		 recursion
		 
		 Diameterclass left=diameterofBinary(root.left);
		 Diameterclass right=diameterofBinary(root.right);
		 
		 int height= left.height+right.height+1;
		 
		 int diameter=Math.max(left.diameter, Math.max(height, right.diameter));
		 int heighta=Math.max(left.height, right.height)+1;
		 
		 return (new Diameterclass(diameter,heighta ));
		 
	 }

}

class Diameterclass{
	int height;
	int diameter;
	
	public Diameterclass(int height,int diameter) {
		this.diameter=diameter;
		this.height=height;
	}

}
