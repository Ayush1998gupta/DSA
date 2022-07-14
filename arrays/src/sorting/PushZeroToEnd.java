package sorting;

import Questions.printArray;

public class PushZeroToEnd {

	public static void pushZeroesAtEnd(int[] arr) {
		
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
//				swap
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
		}

	}

	public static void main(String[] args) {
		int []arr= {2,0,4,1,3,0,3,0};
		pushZeroesAtEnd(arr);
		printArray.printarray(arr);
	}

}
