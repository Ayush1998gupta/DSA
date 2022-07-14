package Questions;
import java.util.Arrays;
public class FindUnique {
	
	public static int findUnique1(int [] arr) {
		int res=Integer.MAX_VALUE;
		Arrays.sort(arr);
		printArray.printarray(arr);
		for (int i = 0; i < arr.length; i+=2) {
			if(arr[i]!=arr[i+1]) {
				return arr[i];
			}
		}
		return res;
	}
	
//	Best solution
	public static int findUnique2(int [] arr) {
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			res=arr[i]^res;
		}
		return res;
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		System.out.println(findUnique2(arr));

	}

}
