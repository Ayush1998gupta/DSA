package Questions;

import java.util.Scanner;

public class printArray {
	
	public static int [] takeinput() {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of Arrays ");
		int n=s.nextInt();
		int arr []=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " +i+ "ith ");
			arr[i]=s.nextInt();
			}
		s.close();
		return arr;
		
	}
	
	public static void printarray(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=takeinput();
		printarray(arr);

	}
	

}
