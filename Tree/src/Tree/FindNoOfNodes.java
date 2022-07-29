package Tree;

public class FindNoOfNodes {
	
	public static  int noOfNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum=0;
		for (int i = 0; i < root.children.size(); i++) {
			sum+=noOfNodes(root.children.get(i));
		}
		
		
		return sum+1;
	}

}
