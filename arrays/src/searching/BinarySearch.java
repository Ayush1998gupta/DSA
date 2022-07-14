package searching;

import java.util.Arrays;
import Questions.printArray;

public class BinarySearch {
	
	// Direct Method
	public static int binarySearch1(int arr[],int x) {
		return Arrays.binarySearch(arr, x);
	}
	
	public static int binarySearch2(int arr[],int x) {
		int s=0;
		int e=arr.length-1;
		int res=-1;
		while(s<e) {
			int mid=(s+e)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]<x) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		int x=3;
		System.out.println(binarySearch2(arr,x));
		
		

	}

}
