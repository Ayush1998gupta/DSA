package pattern;

import java.util.Scanner;

public class Triangular {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

//		for (int i = 1; i <=n; i++) {
//			int p=n+1-i;
//			for (int j = 1; j <=i; j++) {
//				System.out.print(p);
//				p++;
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <=n; i++) {
//			int p=n+1-i;
//			for (int j = 1; j <=i; j++) {
//				System.out.print((char)(64+p));
//				p++;
//			}
//			System.out.println();
//		}

		for (int i = 1; i <=n; i++) {
			int p=n;

			for (int j = 1; j <=n-i; j++) {
				System.out.print(p);
				p--;
			}
			System.out.print("*");

			for(int k=1;k<i;k++) {
				System.out.print(-(k-i));

			}
			System.out.println();
		}

		




		s.close();
	}

}
