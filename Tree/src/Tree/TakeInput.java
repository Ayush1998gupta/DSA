package Tree;

import java.util.Scanner;


public class TakeInput {
	
	public static TreeNode<Integer> takeInput(){
		System.out.println("Enter Root Data");
		Scanner s= new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData== -1) {
			return null;
		}
		TreeNode<Integer> root =new TreeNode<Integer>(rootData);
		System.out.println("Enter No of childs");
		int noChild=s.nextInt();
		
		for (int i = 0; i < noChild; i++) {
			TreeNode<Integer> child=root.children.get(i);
		}
		
		return root;
	}
}
