package question;

public class FibonacciNumber {
	
	public static int fib(int n) {
		if(n<=1) {
			return 1;
		}
		int smallOutput=fib(n-1);
		int smallOutput2=fib(n-2);
		int output =smallOutput+smallOutput2;
		return output;
		
	}

	public static void main(String[] args) {
		
		
			System.out.println(fib(-6));
		
		

	}

}
