package basic;

public class MinStepToOne {

	public static int countMinStepsToOne1(int n) {

		if(n==1) {
			return 0;
		}
		int divideby3count=Integer.MAX_VALUE;
		int divideby2count=Integer.MAX_VALUE;
		int ncount=Integer.MAX_VALUE;
		if(n%3==0) {
			divideby3count=countMinStepsToOne1(n/3);
		}

		if(n%2==0) {
			divideby2count=countMinStepsToOne1(n/2);
		}

		ncount=countMinStepsToOne1(n-1);

		return 1+Math.min(ncount, Math.min(divideby3count, divideby2count));
	}

	public static int countMinStepsToOne2(int n,int[] dp) {
		if(n==1) {
			return 0;
		}

		int divideby3count=Integer.MAX_VALUE;
		int divideby2count=Integer.MAX_VALUE;
		int ncount;

		if(n%2==0) {
			if(dp[n/2]==-1) {
				divideby2count=countMinStepsToOne2(n/2,dp);
				dp[n/2]=divideby2count;
			}else {
				divideby2count=dp[n/2];
			}
		}
		if(n%3==0) {
			if(dp[n/3]==-1) {
				divideby3count=countMinStepsToOne2(n/3,dp);
				dp[n/3]=divideby3count;
			}else {
				divideby3count=dp[n/3];
			}
		}
		if(dp[n-1]==-1) {
			ncount=countMinStepsToOne2(n-1,dp);
			dp[n-1]=ncount;
		}else {
			ncount=dp[n-1];
		}
		dp[n]=1+Math.min(ncount, Math.min(divideby3count, divideby2count));
		return 1+Math.min(ncount, Math.min(divideby3count, divideby2count));
	}
	
	public static int countMinStepsToOne3(int n) {
		if(n==1) {
			return 0;
		}
		int dp[]=new int[n+1];
		
		dp[1]=0;
		
		for (int i = 2; i <= n; i++) {
			int divideby3count=Integer.MAX_VALUE;
			int divideby2count=Integer.MAX_VALUE;
			int ncount=Integer.MAX_VALUE;
			
			ncount=dp[i-1];
			
			if(i%2==0) {
				divideby2count=dp[i/2];
			}
			if(i%3==0) {
				divideby3count=dp[i/3];
			}
			dp[i]=1+Math.min(ncount, Math.min(divideby3count, divideby2count));
			
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int dp[]=new int[11];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=-1;
		}
		System.out.println(countMinStepsToOne3(5));
//		for (int i = 0; i < dp.length; i++) {
//			System.out.print(dp[i]+" ");
//		}
	}

}
