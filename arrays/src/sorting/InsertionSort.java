package sorting;

import Questions.printArray;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j=i-1;
			int temp=arr[i];
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		insertionSort(arr);
		System.out.println("Bubble sort array:");
		printArray.printarray(arr);

	}

}
