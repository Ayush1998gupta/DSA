package question;

public class SumOfArrays {
	
	public static int sum(int input[]) {
		
		if(input.length==1) {
			return input[0];
		}
		

		int temp[]=new int[input.length-1];
		for (int i = 1; i < input.length; i++) {
			temp[i-1]=input[i];
		}
		
		int smalloutput =sum(temp);
		
		return input[0]+smalloutput;
	}

	public static void main(String[] args) {
		

	}

}
