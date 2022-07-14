package arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> result=new ArrayList<>();
		
		result.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(result.contains(arr[i])) {
				continue;
			}else {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr= {10,20,20,20,30,30,40,50,50,50,50,60};
		
		ArrayList<Integer> res= removeDuplicates(arr);
		
		for (int  i : res) {
			System.out.print(i+" ");
		}
		

	}

}
