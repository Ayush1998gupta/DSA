package Questions2;

import Questions.printArray;

public class CheckArrayROtation {
	
	public static int arrayRotationCheck(int [] arr) {
		if(arr.length==0) {
			return -1;
		}
		
		int res=Integer.MAX_VALUE;
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(res>arr[i]) {
				res=arr[i];
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		System.out.println(arrayRotationCheck(arr));
	}

}
