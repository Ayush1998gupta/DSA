package question;

import _Basic.PrintString;

public class ReveveseEachWord {

	public static String reverseString(String str) {

		String res="";
		for (int i = 0; i < str.length(); i++) {
			res=str.charAt(i)+res;
		}
		return res;
	}
	
	public static String reverseEachWord(String str) {
		String reversedString="";
		String finalString="";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==' ') {
				finalString+= reverseString(reversedString)+" ";
				reversedString="";
			}else {
				reversedString+=str.charAt(i);
			}
		}
		finalString+= reverseString(reversedString);
		
		return finalString;
	}

	public static void main(String[] args) {
		String str = "abc def ghi";
		String Reversed=reverseEachWord(str);
		PrintString.print(Reversed);
	}

}
