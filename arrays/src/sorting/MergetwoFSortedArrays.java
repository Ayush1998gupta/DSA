package sorting;

import Questions.printArray;

public class MergetwoFSortedArrays {
	
	
	
	public static int[] merge(int arr1[],int arr2[]){
		int [] merge=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while (i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				merge[k] =arr1[i];
				k++;
				i++;
			}else {
				merge[k] =arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			merge[k] =arr1[i];
			k++;
			i++;
		}
		while (j<arr2.length) {
			merge[k] =arr2[j];
			k++;
			j++;
		}
		return merge;
	}

	public static void main(String[] args) {
		int []arr1= {10,100,500};
		int []arr2= {};
		int []merge=merge(arr1,arr2);
		printArray.printarray(merge);
	}

}
