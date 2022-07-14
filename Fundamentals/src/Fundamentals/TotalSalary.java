package Fundamentals;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double basicSalary=s.nextInt();
		String str=s.next();
		int grade=str.charAt(0);
		
		double allow;
		double hra=0.2*basicSalary;
		double da=0.5*basicSalary;
		double pf=0.11*basicSalary;
		
		if (grade==65) {
			allow=1700;
		} else if(grade==66) {
			allow=1500;
		}else {
			allow=1300;
		}
		
		double totalSalary=basicSalary+hra+da+allow-pf;
		System.out.println((int) Math.round(totalSalary));
		s.close();
	}

}
