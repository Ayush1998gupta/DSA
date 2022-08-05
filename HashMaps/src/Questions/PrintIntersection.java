package Questions;

import java.util.HashMap;

public class PrintIntersection {

	public static void intersection(int arr1[], int arr2[]) {

		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if(!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			}else {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				int freq=map.get(arr2[i]);
				if(freq>0) {
					System.out.print(arr2[i]+" ");
					map.put(arr2[i], map.get(arr2[i]) - 1);
				}
			}

		} 
	}

	public static void main(String[] args) {
		int arr1[]= {1,3,2,2,3,1,6,2,5};
		int arr2[]= {1,2,6,2,3};
		intersection(arr1, arr2);

	}

}
