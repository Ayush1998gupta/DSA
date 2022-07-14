package Fundamentals;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int n=N;
		
		int result =0;
		
		while(n!=0) {
			int d=n%10;
			result =result*10+d;
			n=n/10;
			
		}
		System.out.println(result);
		
		s.close();

	}

}
