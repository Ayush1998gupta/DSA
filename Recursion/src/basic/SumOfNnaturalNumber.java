package basic;

public class SumOfNnaturalNumber {
	
	public static int sumOfNatural(int n) {
		if(n==0) {
			return 0;
		}
		int smallOutput=sumOfNatural(n-1);
		int output=n+smallOutput;
		return output;
	}

	public static void main(String[] args) {
		System.out.println(sumOfNatural(4));

	}

}
