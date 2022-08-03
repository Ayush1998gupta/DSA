package basic;

public class Staircase {

	//	Recursion
	public static int staircase1(int n) {
		//		Base Case
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}


		int small1=staircase1(n-1);
		int small2=staircase1(n-2);
		int small3=staircase1(n-3);

		return small1+small2+small3;
	}

	public static int staircase2(int n,int dp[]) {

		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}

		int small1,small2,small3;
		if(n-1>=0) {
			if(dp[n-1]==-1) {
				small1=staircase2(n-1,dp);
				dp[n-1]=small1;
			}else {
				small1=dp[n-1];
			}
		}else {
			small1=0;
		}
		if(n-2>=0) {
			if(dp[n-2]==-1) {
				small2=staircase2(n-2,dp);
				dp[n-1]=small2;
			}else {
				small2=dp[n-2];
			}
		}else {
			small2=0;
		}
		if(n-3>=0) {
			if(dp[n-3]==-1) {
				small3=staircase2(n-3,dp);
				dp[n-1]=small3;
			}else {
				small3=dp[n-3];
			}
		}else {
			small3=0;
		}

		dp[n]=small1+small2+small3;
		return small1+small2+small3;
	}
	public static void main(String[] args) {
		int dp[]=new int[5];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=-1;
		}
		System.out.println(staircase2(4, dp));
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i]+" ");
		}
	}

}
