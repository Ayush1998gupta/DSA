package Fundamentals;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int res=1;
		for (int i = 1; i <=n; i++) {
			res*=x;
//			System.out.println(res);
		}
		System.out.println(res);
		s.close();
	}

}
