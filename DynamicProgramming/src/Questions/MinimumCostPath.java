package Questions;

public class MinimumCostPath {


	public static int minCostPath1(int [][] input ,int i,int j) {
		int m=input.length;
		int n=input[0].length;
		//		special case
		if(i==m-1 && j==n-1) {
			return input[i][j];
		}
		//		base case
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}


		int rightMinCost=minCostPath1(input, i, j+1);
		int digonalMinCOst=minCostPath1(input, i+1, j+1);
		int downMinCost=minCostPath1(input, i+1, j);

		int minCost=Math.min(digonalMinCOst, Math.min(rightMinCost, downMinCost));

		return minCost+input[i][j];
	}

	public static int minCostPath2(int [][] input ,int i,int j,int cost[][]) {
		int m=input.length;
		int n=input[0].length;
		//		special case
		if(i==m-1 && j==n-1) {
			return input[i][j];
		}
		//		base case
		if(i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}

		int rightMinCost,digonalMinCost,downMinCost;

		if(cost[i][j+1]==-1) {
			rightMinCost=minCostPath2(input, i, j+1,cost);
			cost[i][j+1]=rightMinCost;
		}else {
			rightMinCost=cost[i][j+1];
		}
		if(cost[i+1][j+1]==-1) {
			digonalMinCost=minCostPath2(input, i+1, j+1,cost);
			cost[i+1][j+1]=digonalMinCost;
		}else {
			digonalMinCost=cost[i+1][j+1];
		}
		if(cost[i+1][j]==-1) {
			downMinCost=minCostPath2(input, i+1, j,cost);
			cost[i+1][j]=downMinCost;
		}else {
			downMinCost=cost[i+1][j];
		}

		int minCost=Math.min(digonalMinCost, Math.min(rightMinCost, downMinCost));

		return minCost+input[i][j];
	}

	public static int minCostPath3(int [][] input) {
		int m=input.length;
		int n=input[0].length;
		int cost[][] =new int[m+1][n+1];
		for (int i = 0; i < cost.length; i++) {
			for (int j = 0; j < cost[i].length; j++) {
				cost[i][j]=Integer.MAX_VALUE;
			}

		}

		int minCost;
		for (int i = m-1; i >=0; i--) {
			for (int j = n-1; j >=0; j--) {
				if(i==m-1 && j==n-1) {
					cost[i][j]=input[i][j];
					continue;
				}

				int rightMinCost=input[i][j+1];
				int digonalMinCost=input[i+1][j+1];
				int downMinCost=input[i+1][j];

				minCost=Math.min(digonalMinCost, Math.min(rightMinCost, downMinCost));

				cost[i][j]=minCost+input[i][j];
			}

		}


		return cost[0][0];
	}
}
