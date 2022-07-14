package string;

public class Replace_pi {
	
	public static String replacepi(String str) {
		if(str.length()<=1) {
			return str;
		}

		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			String smallout=replacepi(str.substring(2));
			return "3.14"+ smallout;
		}else {
			String smallout=replacepi(str.substring(1));
			return str.charAt(0)+smallout;
		}

	}

	public static void main(String[] args) {
		System.out.println(replacepi("apipiip"));

	}

}
