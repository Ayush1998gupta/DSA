package basic;

public class Factorial {
	
//	For finding n factorial 
//	First find n-1 factoral
//	once find n-1 simple multiply with the n to get the ans
	
	public static int fact(int n) {
//		base case
		if(n==0) {
			return 1;
		}
		
//		finding (n-1) fact
		int smallOutput=fact(n-1);
		
//		multiply with n
		int output =n*smallOutput;
		return output;
	}

	public static void main(String[] args) {
		System.out.println(fact(3));

	}

}
