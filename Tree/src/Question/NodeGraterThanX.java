package Question;

import BinaryTree1.BinaryTreeNode;

public class NodeGraterThanX {
	
	public static int countNodeGraterThanX(BinaryTreeNode<Integer>root,int x) {
		if(root==null) {
			return 0;
		}
		
		int leftCount=countNodeGraterThanX(root.left, x);
		int rightCount=countNodeGraterThanX(root.right, x);
		
		if(root.data>x) {
			return 1+leftCount+rightCount;
		}else {
			return leftCount+rightCount;
		}
	}

}
