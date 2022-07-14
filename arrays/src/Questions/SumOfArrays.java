package Questions;

public class SumOfArrays {
	
	public static int sum(int[]arr) {
		int res=0;
//		going to each element and adding to the res
		for (int i : arr) {
			res+=i;
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		int arr []=printArray.takeinput();
//		printArray.printarray(arr);
		System.out.println(sum(arr));
		

	}

}
