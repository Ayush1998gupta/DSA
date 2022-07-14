package basic;

public class NumberOfDigit {
	
	public static int count(int n) {
		if(n==0) return 0;
		
//		int smallOutput=count(n/10);
//		int output = 1+smallOutput;
//		return output;
		
		return 1+count(n/10);
	}

	public static void main(String[] args) {
		System.out.println(count(3000));

	}

}
