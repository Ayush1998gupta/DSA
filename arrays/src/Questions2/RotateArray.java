package Questions2;

import Questions.printArray;

public class RotateArray {

	public static void rotateArrayOneTime(int [] arr) {
		int temp=arr[0];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static void rotate1(int [] arr ,int d) {
		if(d>arr.length) {
			d-=arr.length;
		}
		for (int i = 0; i < d; i++) {
			rotateArrayOneTime(arr);
		}
	}
	
	public static void rotate2(int [] arr ,int d) {
		int tempArr[]=new int[d-1];
//		copying the first d element to thr temp Array
		for (int i = 0; i < tempArr.length; i++) {
			tempArr[i]=arr[i];
		}
		int k=0;
//		Shifting the array d position
		for (int i = tempArr.length; i < arr.length; i++) {
			arr[k]=arr[i];
			k++;
		}
		k=1;
//		Copying back the first d element to the last
		for (int i = arr.length-d-1; i < arr.length; i++) {
			
//			arr[i]=tempArr[k];
			k++;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int []arr= {2,6,3,1,5,9,8};
		rotate2(arr,2);
		printArray.printarray(arr);
	}

}
