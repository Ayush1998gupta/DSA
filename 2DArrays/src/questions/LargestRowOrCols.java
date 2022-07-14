package questions;

import Basic.inputAndPrint;

public class LargestRowOrCols {

	public static void findLargest(int mat[][]) {
		
		if(mat.length==0) {
			System.out.println("row "+0+" "+Integer.MIN_VALUE);
			return;
		}
		
		int largestRowSum=Integer.MIN_VALUE;
		int largestColSum=Integer.MIN_VALUE;
		int row=mat.length;
		int cols=mat[0].length;
		int indexRow=-1;
		int indexCols=-1;
		
		for (int j = 0; j < cols; j++) {
			int sum=0;
			for (int i = 0; i < row; i++) {
				sum+=mat[i][j];
			}
			if(largestColSum<sum) {
				largestColSum=sum;
				indexCols=j;
			}
			
		}
		
		for (int i = 0; i < row; i++) {
			int sum=0;
			for (int j = 0; j < cols; j++) {
				sum+=mat[i][j];
			}
			if(largestRowSum<sum) {
				largestRowSum=sum;
				indexRow=i;
			}
		}
		
		if(largestRowSum>=largestColSum) {
			System.out.println("row "+indexRow+" "+largestRowSum);
		}else {
			System.out.println("column "+indexCols+" "+largestColSum);
		}
	}

	public static void main(String[] args) {
		int arr[][]= inputAndPrint.takeInput();
		inputAndPrint.printArray(arr);
		findLargest(arr);

	}

}
