package sorting;

import Questions.printArray;

public class BubbleSort {
	
	
	public static void bubbleSort(int [] arr) {
		  for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[i]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		bubbleSort(arr);
		System.out.println("Bubble sort array:");
		printArray.printarray(arr);

	}

}
