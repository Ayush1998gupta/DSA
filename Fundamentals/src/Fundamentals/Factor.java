package Fundamentals;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		s.close();
	}

}
