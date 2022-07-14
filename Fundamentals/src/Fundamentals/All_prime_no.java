package Fundamentals;

import java.util.Scanner;

public class All_prime_no {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		for (int i = 2; i <= N; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}
		
		s.close();

	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
