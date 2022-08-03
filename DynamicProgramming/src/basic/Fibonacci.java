package basic;

import java.util.Scanner;

public class Fibonacci {

	
//	Memoization
	public static int fibonacci(int n,int []dp) {
		if(n==0  || n==1) {
			return n;
		}

		int smallAns1,smallAns2,ans;


		if(dp[n-1]==-1) {
			smallAns1=fibonacci(n-1,dp);
			dp[n-1]=smallAns1;
		}else {
			smallAns1=dp[n-1];
		}

		if(dp[n-2]==-1) {
			smallAns2=fibonacci(n-2,dp);
			dp[n-2]=smallAns2;
		}else {
			smallAns2=dp[n-2];
		}
		ans=smallAns1+smallAns2;
		dp[n]=ans;
		return ans;
	}

//	
	public static int fibb(int n,int[]dp) {
		dp[0]=0;
		dp[1]=1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int dp[]=new int[n+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i]=-1;
		}
		System.out.println(fibb(n,dp));
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i]+" ");
		}
		s.close();
	}

}
