package Fundamentals;

import java.util.Scanner;

public class MultipliactionTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for (int i = 1; i <=10  ; i++) {
			System.out.println(n*i);
		}
		
		s.close();
	}

}
