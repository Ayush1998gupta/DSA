package basic;

public class MinNumberOfSquares {
	
	public static int minCount(int n) {
		if(n==0) {
			return 0;
		}
		int minans=Integer.MAX_VALUE;
		for (int i = 1; i*i<=n; i++) {
			int currAns=minCount(n-(i*i));
			if(currAns<minans) {
				minans=currAns;
			}
		}
		return minans+1;
	}
	
	public static int minCount2(int n,int []dp) {
		if(n==0) {
			return 0;
		}
		int minans=Integer.MAX_VALUE;
		for (int i = 1; i*i<=n; i++) {
			int currAns;
			if(dp[n-(i*i)]==-1) {
				currAns=minCount2(n-(i*i), dp);
				dp[n-(i*i)]=currAns;
			}else {
				currAns=dp[n-(i*i)];
			}
			
			if(currAns<minans) {
				minans=currAns;
			}
		}
		
		dp[n]=minans+1;
		return minans+1;
	}
	
	public static int minCount3(int n) {
		int dp[]=new int[n+1];
		dp[0]=0;
		for (int i = 1; i <= n; i++) {
			int minans=Integer.MAX_VALUE;
			for (int j = 1; j*j <=i ; j++) {
				int currAns=dp[i-(j*j)];
				if(currAns<minans) {
					minans=currAns;
				}
			}
			dp[i]=1+minans;
		}
		
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int dp[]=new int[11];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=-1;
		}
		System.out.println(minCount3(10));
//		for (int i = 0; i < dp.length; i++) {
//			System.out.print(dp[i]+" ");
//		}
	}

}
