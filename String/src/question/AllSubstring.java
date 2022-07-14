package question;

import java.util.Scanner;

public class AllSubstring {
	
	public static void printSubstring(String str) {
		if(str.length()==0||str==null) {
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
//		System.out.println(str.substring(1, 2));
		printSubstring(str);
		s.close();

	}

}
