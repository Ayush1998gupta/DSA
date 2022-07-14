package Fundamentals;

import java.util.Scanner;

public class Nth_Fibonacci_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int f1=1,f2=1,res=1;
		
		for(int i=2;i<n;i++) {
			res=f1+f2;
			f1=f2;
			f2=res;
		}
		System.out.println(res);
		s.close();

	}

}
