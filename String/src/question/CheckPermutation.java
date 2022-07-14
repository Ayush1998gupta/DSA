package question;

public class CheckPermutation {

	public static boolean isPermutation(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		int[] frequency=new int[256];
		
		for (int i = 0; i < str1.length(); i++) {
			char at=str1.charAt(i);
			frequency[at]+=1;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char at=str2.charAt(i);
			frequency[at]-=1;
		}
		
		for (int i = 0; i < frequency.length; i++) {
			if(frequency[i]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1="aba";
		String str2="baaa";
		boolean ans= isPermutation(str1,str2);
		System.out.println(ans);
	}

}
