package _Basic;

public class PrintString {
	
	public static void print(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		print("Ayush Guta");

	}

}
