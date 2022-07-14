package question;

import _Basic.PrintString;

public class ReverseStringWord {
	
	public static String reverseWordWise(String str) {
		
		if(str.length()==0||str==null) {
			return "";
		}
		String res="";
		String temp="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				res=temp+" "+res;
				temp="";
			}else {
				temp+=str.charAt(i);
			}
		}
		
		res=temp+" "+res;
		return res;
	}

	public static void main(String[] args) {
		String str = "abc def ghi";
		String Reversed=reverseWordWise(str);
		PrintString.print(Reversed);

	}

}
