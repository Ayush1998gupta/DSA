package BST1;

import BinaryTree1.BinaryTreeNode;

public class IsBST {

	public static isBSTReturn isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
			isBSTReturn ans=new isBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		isBSTReturn isLeft=isBST(root.left);
		isBSTReturn isRight=isBST(root.right);
		
		int min=Math.min(root.data, Math.min(isLeft.min, isRight.min));
		int max=Math.max(root.data,Math.max(isLeft.max, isRight.max));
		
		boolean isBST=true;
		
		if(isLeft.max>=root.data) {
			isBST=false;
		}
		
		if(isRight.min<root.data) {
			isBST=false;
		}
		
		if(!isLeft.isBST && !isRight.isBST) {
			isBST=false;
		}
		isBSTReturn ans=new isBSTReturn(min, max, isBST);
		
		
		return ans ;
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root,int minRange,int maxRange) {
		
		if(root==null) {
			return true;
		}
		
		if(root.data<minRange|| root.data>maxRange) {
			return false;
		}
		boolean isLeftWithRange =isBST(root.left, minRange, root.data-1);
		boolean isRightWithRange= isBST(root.right, root.data, maxRange);
		
		return isLeftWithRange && isRightWithRange;
		
	}
}

class isBSTReturn{
	int min;
	int max;
	boolean isBST;
	
	public isBSTReturn(int min, int max, boolean isBST) {
		this.isBST=isBST;
		this.min=min;
		this.max=max;
	}
}
