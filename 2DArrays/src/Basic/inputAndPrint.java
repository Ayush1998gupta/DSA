package Basic;

import java.util.Scanner;

public class inputAndPrint {
	
	public static int [] [] takeInput(){
		Scanner s =new Scanner(System.in);	
		System.out.print("Enter the Number of rows ");
		int rows =s.nextInt();
		System.out.print("Enter the Number of cols ");
		int cols =s.nextInt();
		
		int [][] arr=new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter the element at ("+ i +","+j+") ");
				arr[i][j]=s.nextInt();

			}
		}
		s.close();
		return arr;
	}
	
	public static void printArray(int arr[][]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr [][]=takeInput();
		printArray(arr);
		
		
	}

}
