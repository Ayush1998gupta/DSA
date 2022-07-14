package sorting;

import Questions.printArray;

public class SelectionSort {
	
	public static void selectonSort(int [] arr) {
		
//		traversing through array 
		for (int i = 0; i < arr.length; i++) {
			
//			Find the minimum element
			int min= Integer.MAX_VALUE;
			int minIndex=-1;
			
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
//			swap
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
	}
	

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		selectonSort(arr);
		System.out.println("Selection sort array:");
		printArray.printarray(arr);
	}

}
