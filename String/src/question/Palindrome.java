package question;

import java.util.Scanner;

public class Palindrome {
	public static String reverseString(String str) {

		String res="";
		for (int i = 0; i < str.length(); i++) {
			res=str.charAt(i)+res;
		}
		return res;
	}
	
	public static boolean isPalindrome(String str) {
		
		if (str.equals(reverseString(str))) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		boolean res=isPalindrome(str);
		System.out.println(res);
		s.close();


	}

}
