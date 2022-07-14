package question;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {

		if(str.length()==0) {
			return "";
		}
		if(str.length()==1) {
			return str;
		}
		String res="";

		for (int startIndex = 0; startIndex < str.length(); startIndex++) {
			res+=str.charAt(startIndex);

			int j;
			for (j = startIndex+1; j < str.length() && 							str.charAt(startIndex)==str.charAt(j)  ; j++) {
			}

			startIndex=j-1;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("xxyyzxx"));
	}

}
