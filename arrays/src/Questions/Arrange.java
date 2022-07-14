package Questions;

public class Arrange {

	
	public static void arrange(int[] arr,int n) {
		int count=1;
		int s=0,e=arr.length-1;
		while (s<e) {
			arr[s]=count++;
			arr[e]=count++;
			s++;e--;
		}
		if(s==e) {
			arr[s]=count;
		}
	}
	
	public static void main(String[] args) {
		int n=7;
		int arr []=new int[n];
		arrange(arr,n);
		printArray.printarray(arr);
		

	}

}
