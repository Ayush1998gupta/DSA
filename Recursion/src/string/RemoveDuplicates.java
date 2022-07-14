package string;

public class RemoveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {  
		
		if(str.length()<=1) {
			return str;
		}
		
		if(str.charAt(0)==str.charAt(1)) {
			String smallout=removeConsecutiveDuplicates(str.substring(1));
			return smallout;
		}else {
			String smallout=removeConsecutiveDuplicates(str.substring(1));
			return str.charAt(0)+smallout;
		}

	}


	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aabccbaaaaxcc"));

	}

}
