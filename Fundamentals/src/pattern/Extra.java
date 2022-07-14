package pattern;

import java.util.Scanner;

public class Extra {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
//		System.out.println("*");
//		
//		for (int i = 1; i <=n; i++) {
//			System.out.print("*");
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int j=i-1;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.print("*");
//			System.out.println();
//		}
//		for (int i = n-1; i >=1; i--) {
//			System.out.print("*");
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int j=i-1;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.print("*");
//			System.out.println();
//		}
		
		
//		for (int i = 1; i <=n; i++) {
//			for(int sp=1;sp<=i-1;sp++) {
//				System.out.print(" ");
//			}
//			for(int st=1;st<=n;st++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <=n; i++) {
//			int res=0;
//			for(int j=1;j<=i;j++) {
//				res+=j;
//				System.out.print(j);
//				if(j==i) {
//					break;
//				}
//				System.out.print("+");
//				
//			}
//			System.out.print("=");
//			System.out.println(res);
//			
//		}

		int z=0;
		
		for (int i = 1; i <=n; i++) {
			int p=1+z;
			int y=1;
			for (int j =n; j >=i; j--) {
				System.out.print(p);
				p=p+2;
			}
			for(int k=1;k<i;k++) {
				System.out.print(y);
				
			}
			System.out.println();
			z+=2;y=+2;
		}
		s.close();
	}
	
}
