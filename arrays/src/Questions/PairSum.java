package Questions;

import java.util.Arrays;

public class PairSum {

	public static int pairSum(int [] arr,int x) {
		int count=0;
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while (i<j) {
//			TODO 
			if(arr[i]+arr[j]==x) {
				count++;
				if(arr[i]==arr[i+1]) {
					i++;
				}else {
					j--;
				}
			}
			else if(arr[i]+arr[j]>x) {
				j--;
			}
			else if(arr[i]+arr[j]<x) {
				i++;
			}
		}
		return count;
	}

}
