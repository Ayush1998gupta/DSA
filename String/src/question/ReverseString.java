package question;

import java.util.Scanner;
import _Basic.PrintString;

public class ReverseString {
	public static String reverseString(String str) {
		
		String res="";
		for (int i = 0; i < str.length(); i++) {
			res=str.charAt(i)+res;
		}
		return res;
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String res=reverseString(str);
		PrintString.print(res);
		s.close();

	}

}
