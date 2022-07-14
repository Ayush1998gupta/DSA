package question;

public class CheckIfArrayIsSorted {

	
//	used an extra array
	public static boolean isSorted1(int [] arr) {
		if(arr.length==1) {
			return true;
		}
		
		if(arr[0]>arr[1]) {
			return false;
		}
		

		int temp[]=new int[arr.length-1];
		for (int i = 1; i < arr.length; i++) {
			temp[i-1]=arr[i];
			
		}

		boolean smalloutput=isSorted1(temp);

		return smalloutput;
	}
	
//	without using extra array
	public static boolean isSorted2(int [] arr,int startIndex) {
		if(startIndex==arr.length-1) {
			return true;
		}
		
		if(arr[startIndex]>arr[startIndex+1]) {
			return false;
		}
		boolean smalloutput=isSorted2(arr,startIndex+1);
		return smalloutput;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,9,4,5};
		System.out.println(isSorted2(arr,0));

	}

}
