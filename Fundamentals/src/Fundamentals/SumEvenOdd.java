package Fundamentals;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int even=0;
		int odd=0;
		while(N>0) {
			
			int check=N%10;
//			System.out.println("check" + check);
			if(check%2==0) {
				even+=check;
//				System.out.println("even"+even);
			}else {
				odd+=check;
//				System.out.println("odd"+odd);
			}
			N=N/10;
		}
		
		System.out.println(even+" "+odd);
		s.close();

	}

}
