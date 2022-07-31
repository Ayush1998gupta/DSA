package RatInAMaze;

public class PrintAllPath {

	public static void  printAllPath(int maze[][] ,int i ,int j,int path [][]) {
		int n=maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1) {
			return;
		}
		//		include current path
		path[i][j]=1;

		if(i==n-1 && j==n-1) {
			for (int r = 0; r < path.length; r++) {
				for (int c = 0; c < path.length; c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			path[i][j]=0;
			System.out.println();
			return;
		}
		
		printAllPath(maze, i-1, j, path);
		printAllPath(maze, i, j+1, path);
		printAllPath(maze, i+1, j, path);
		printAllPath(maze, i, j-1, path);
		path[i][j]=0;
	}



	public static void main(String[] args) {
		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
		int path[][]=new int[maze.length][maze.length];
		printAllPath(maze, 0, 0, path);

	}

}
