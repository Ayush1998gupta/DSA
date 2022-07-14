package questions;

public class PrintWave {
	
	public static void WavePrint(int mat[][] ){
		int p=0;
		int row=mat.length;
		int col =mat[0].length;
		
		for (int j = 0; j < col; j++) {
			if(p%2==0) {
				for (int i = 0; i < row; i++) {
					System.out.println(mat[i][j]);
				}
			}else {
				for (int i = row-1; i <= 0; i++) {
					System.out.println(mat[i][j]);
				}
			}
		}
	}

}
