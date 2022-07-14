package question;

public class CompressString {
	
	public static String getCompressedString(String str) {
		if(str.length()==0) {
			return "";
		}
		String res="";

		for (int startIndex = 0; startIndex < str.length(); startIndex++) {
				res+=str.charAt(startIndex);
				
				int j;
				int count=0;
				for (j = startIndex+1; j < str.length() && str.charAt(startIndex)==str.charAt(j)  ; j++) {
					count++;
				}
				
				startIndex=j-1;
				
				if(count==0) {
					continue;
				}
				res+=count+1;
			}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(getCompressedString("aaabbcdde"));
		

	}

}
