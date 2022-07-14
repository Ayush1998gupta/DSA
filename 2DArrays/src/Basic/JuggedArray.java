package Basic;

public class JuggedArray {

	public static void main(String[] args) {
		int [][] arr= new int [3][];
		
		arr[0]=new int [9];
		arr[1]=new int[5];
		arr[2]=new int[3];
		arr[1][3]=9;
		
		inputAndPrint.printArray(arr);

	}

}
