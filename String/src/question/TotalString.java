package question;

public class TotalString {

	static int countStr(int n,int bCount,int cCount)
	{
		// Base cases
		if (bCount < 0 || cCount < 0) return 0;
		if (n == 0) return 1;
		if (bCount == 0 && cCount == 0) return 1;

		// Three cases, we choose, a or b or c
		// In all three cases n decreases by 1.
		int res = countStr(n - 1, bCount, cCount);
		res += countStr(n - 1, bCount - 1, cCount);
		res += countStr(n - 1, bCount, cCount - 1);

		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
