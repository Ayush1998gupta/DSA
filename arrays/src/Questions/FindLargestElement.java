package Questions;

public class FindLargestElement {
	
	public static int largest(int[]arr) {
//		it could be the any integer value so set to 
//		min
		int res=Integer.MIN_VALUE;
		for (int i : arr) {
			if(res<i) {
				res=i;
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		
		int arr []=printArray.takeinput();
//		printArray.printarray(arr);
		System.out.println(largest(arr));
		

	}

}
