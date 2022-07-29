package Tree;

public class SumOfAllNodes {
	
	public static int sunmOfAllNode(TreeNode<Integer> root) {
		
		int sum=0;
		for (int i = 0; i < root.children.size(); i++) {
			sum+=sunmOfAllNode(root.children.get(i));
		}
		
		
		
		return sum+root.data;
	}

}
