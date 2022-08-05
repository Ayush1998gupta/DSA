package Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDupliucates(int []arr){
		
		ArrayList<Integer> res=new ArrayList<Integer>();
		HashMap<Integer, Boolean> map=new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], true);
				res.add(arr[i]);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,3,2,2,3,1,6,2,5};
		ArrayList<Integer> out=removeDupliucates(arr);
		System.out.println(out);
	}

}
