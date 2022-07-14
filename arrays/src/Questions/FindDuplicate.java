package Questions;



public class FindDuplicate {
	
	public static int findDuplicate(int arr[]) {
		int res=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		System.out.println(findDuplicate(arr));

	}

}
