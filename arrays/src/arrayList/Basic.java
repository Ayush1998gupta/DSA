package arrayList;

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			arr.add(i*10);
		}
		arr.add(3);
		
//		arr.add(1, 60);
		
		arr.remove(3);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+ " ");
		}
		
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println(arr.indexOf(5));

	}

}
