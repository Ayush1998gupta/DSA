package question;

import java.util.Scanner;

public class CountWords {
	
	public static int countWords(String str) {
		if(str.length()==0 ||str==null) {
			return 0;
		}
		int res=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				res++;
			}
		}
		
		return res+1;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countWords(str));
		s.close();
	}

}
