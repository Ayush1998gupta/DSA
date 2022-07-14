package pattern;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

//		for (int i = 1; i <=n; i++) {
//			int p=i;
//			for (int j = 1; j <=n; j++) {
//				System.out.print(p);
//				p++;
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <=n; i++) {
//			
//			for (int j = 1; j <=n; j++) {
//				System.out.print((char)(64+j));
//				
//			}
//			System.out.println();
//		}

		int n1=(n+1)/2,n2=n/2;
		
		
		for (int i = 1; i <=n1; i++) {
			
			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int l=i-1;l>=1;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n2; i >=1; i--) {

			for (int j = 1; j <=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}

			for(int l=i-1;l>=1;l--) {
				System.out.print("*");
			}
			System.out.println();
		}



		s.close();
	}

}
