package Questions;

public class LCS {
	
	public static int lcs(String str1,String str2,int i,int j) {
		if(i==str1.length() || j==str2.length()) {
			return 0;
		}
		int maxAns;
		if(str1.charAt(i)==str2.charAt(j)) {
			maxAns=1+lcs(str1, str2, i+1, j+1);
		}else {
			int includestr1=lcs(str1, str2, i+1, j);
			int includestr2=lcs(str1, str2, i, j+1);
			maxAns=Math.max(includestr1, includestr2);
		}
		return maxAns;
	}
	
	public static void main(String[] args) {
		System.out.println(lcs("adebc", "dcadb", 0, 0));
	}

}
