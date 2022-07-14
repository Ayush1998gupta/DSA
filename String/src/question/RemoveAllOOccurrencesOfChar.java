package question;

public class RemoveAllOOccurrencesOfChar {
	
	public static String removeAllOOccurrencesOfChar(String str,char ch) {
		
		if(str.length()==0) {
			return "";
		}
		String ans="";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				continue;
			}
			ans+=str.charAt(i);
		}
		
		return ans;
	}
	

	public static void main(String[] args) {
		char ch='y';
		System.out.println(removeAllOOccurrencesOfChar("xxyyzxx",ch));

	}

}
