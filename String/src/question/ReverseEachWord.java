package question;

public class ReverseEachWord {

	public static String reverseString(String str) {

		String res="";
		for (int i = 0; i < str.length(); i++) {
			res=str.charAt(i)+res;
		}
		return res;
	}

	public static String reverseEachWord(String str) {
		
		if(str.length()==0) {
			return "";
		}
		String ans="";
		String temp="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				ans+=reverseString(temp)+" ";
				temp="";
			}else {
				temp+=str.charAt(i);
			}
		}

		ans+=reverseString(temp)+" ";


		return ans;
	}

	public static void main(String[] args) {
		System.out.println(reverseEachWord("Ayush Kumar Gupta"));

	}

}
