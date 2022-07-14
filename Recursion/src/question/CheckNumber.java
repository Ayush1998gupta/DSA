package question;

public class CheckNumber {

	public static boolean checkNumber(int input[], int x) {
		if(input.length==1) {
			if(input[0]==x) {
				return true;
			}
			return false;
		}

		if(input[0]==x) {
			return true;
		}

		int temp[]=new int[input.length-1];
		for (int i = 1; i < input.length; i++) {
			temp[i-1]=input[i];
		}

		boolean smalloutut=checkNumber(temp,x);

		return smalloutut;
	}

	public static boolean checkNumber(int input[], int x,int startIndex) {
		if(startIndex==input.length-1) {
			if(input[0]==x) {
				return true;
			}
			return false;
		}

		if(input[startIndex]==x) {
			return true;
		}

		boolean smalloutut=checkNumber(input,x,startIndex+1);

		return smalloutut;

	}

	public static int firstIndex(int input[], int x,int startIndex) {
		if(startIndex==input.length) {
			return -1;
		}

		if(input[startIndex]==x) {
			return startIndex;
		}


		int smalloutut=firstIndex(input,x,startIndex+1);

		return smalloutut;

	}

	public static int lastIndex(int input[], int x,int lastIndex) {
		
		if(lastIndex==0) {
			if(input[0]==x) {
				return lastIndex;
			}
			return -1;
		}

		if(input[lastIndex]==x) {
			return lastIndex;
		}


		int smalloutut=firstIndex(input,x,lastIndex-1);

		return smalloutut;
	}


}
