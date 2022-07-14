package string;

public class Remove_X {
	
	public static String removeX(String str) {
		if(str.length()==0) {
			return str;
		}
		
		String smallout=removeX(str.substring(1));
		
		if(str.charAt(0)=='x') {
			return smallout;
		}else {
			return str.charAt(0)+smallout;
		}

	}

	public static void main(String[] args) {
		System.out.println(removeX("xabxcxt"));

	}

}
