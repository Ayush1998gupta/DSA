package Fundamentals;

import java.util.Scanner;

public class CheckArmstrongf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		int originalNumber=number, remainder, result = 0, n = 0;
		
		for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println("true");
        else
            System.out.println("false");
		
       
	}

}
