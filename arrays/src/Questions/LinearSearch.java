package Questions;

public class LinearSearch {
	
	public static int linearSearch(int[]arr,int x) {
		int res=-1;
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]) {
				return i; 
			}
		}
		return res;
		
	}
	

	public static void main(String[] args) {
		
		int arr []=printArray.takeinput();
//		printArray.printarray(arr);
		System.out.println(linearSearch(arr,5));
		

	}

}
