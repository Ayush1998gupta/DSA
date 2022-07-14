package Questions;

public class SwapAlternate {
	
	public static void swapAlternate(int arr[]) {
		for (int i = 0; i < arr.length; i+=2) {
//			System.out.println(i);
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}

	public static void main(String[] args) {
		int arr []=printArray.takeinput();
		System.out.println("Input array");
		printArray.printarray(arr);
		swapAlternate(arr);
		System.out.println("Swaped array");
		printArray.printarray(arr);
	}

}
