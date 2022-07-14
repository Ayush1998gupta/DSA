package question;

public class HighestOccuringChar {

	public static char highestOccuringChar(String str) {
		
		if(str.length()==0) {
			return ' ';
		}
		char ans;
		
		int[] frequency=new int[256];

		for (int i = 0; i < str.length(); i++) {
			char at=str.charAt(i);
			frequency[at]+=1;
		}
		
		int res=Integer.MIN_VALUE;
		int index=-1;
		for (int i = 0; i < frequency.length; i++) {
			if(frequency[i]>res) {
				res=frequency[i];
				index=i;
			}
		}	
		ans=(char)index;
		return ans;
	}

	public static void main(String[] args) {
		
		System.out.println(highestOccuringChar("abccccffdgaaaodncc"));

	}

}
