package questions;


public class TotalSumOnBoundariesAndDiagonals {

	public static void taotalSum(int arr[][]) {
		int sum=0;
		int N=arr.length;
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < N; j++) {

//				Sum of all the diagonals both 
				if(i==j || (i+j)==N-1) {
					sum+=arr[i][j];
				}else if (i==0|| j==0|| i==N-1|| j==N-1) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
//		int arr[][]= inputAndPrint.takeInput();
//		inputAndPrint.printArray(arr);
//		taotalSum(arr);
		System.out.println(1%2);
	}

}
