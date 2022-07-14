package Basic;

public class LargestColsSum {

	
	public static int largestColSum(int [][] mat) {
		int res=Integer.MIN_VALUE;
		int row=mat.length;
		int cols=mat[0].length;
		
		for (int j = 0; j < cols; j++) {
			int sum=0;
			for (int i = 0; i < row; i++) {
				sum+=mat[i][j];
			}
			if(res<sum) {
				res=sum;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[][]= inputAndPrint.takeInput();
		inputAndPrint.printArray(arr);
		System.out.println(largestColSum(arr));
	}

}
