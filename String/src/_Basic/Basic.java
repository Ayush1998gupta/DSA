package _Basic;

import java.util.Scanner;

public class Basic {
	
	public static void main(String[] args) {
		String str1 ="Ayush";
		String str2="Gupta";
		
		
//		return length of the string "integer"
		str1.length();
		
//		return the character at that position "Integer"
		str1.charAt(3);
		
//		Concatenates the two string into third string or into same also
		str1=str1.concat(str2);
//		this also do the same
		str1+=str2;
		
//		check the both the string is equal or not "Boolean" 
		str1.equals(str2);
//		Compares two strings lexicographically "Integer"
		str1.compareTo(str2);
		
//		want to check the string conatains somethingb or not
		str1.contains("ing");
		
//		******************************************************    //
//		SubString
		
//		this give all the string after the value(incusive)
		str1.substring(2);
		
//		if value is equal to the length of string it gives the nothing
//		(not error) i.e length of substring is 0
		
		
//		in this end will be excluded
		str1.substring(3, 5);
	
//		******************************************************    //
//		Taking Input
		Scanner s= new Scanner(System.in);
		
//		this only take the first token if there is "space" ,"tab","\n"
		String str3,str4;
		str3=s.next();	
		System.out.println(str3+" "+str3.length());
		s.close();
//		to take whole line we use
		str4=s.nextLine();
		System.out.println(str4+" "+str4.length());
		
//		******************************************************    //
		
//		Strings are stored in two different ways like
//		String str5= "Abc";
//		or
//		String str6= new String("abc");

//		NOTE:-> As we know the local variable are stored in the stack
//		and primitive are stored in the Heap
//		like there is array named arr its ref is stored in the stack and 
//		actuall array is stored in the heap
		
//		so like this only when we create the string with the new keyword
//		its ref is stored in the stack and actual string in the heap
		
//		MOST IMP -> string created without new is stored in the 
//		"STRING POOL" -> This is the area in the heap 
//		This come in picture for the space optimization
		
//		String str7="abc";
		
//		in java first it search that the wether the same string present 
//		in the StringPool if present point the str7 to that only 
//		and not create the new string 
		
//		This is the reason why the String in java is IMMUTABLE
//		as we change the string the rest be like m kya karu pir
		
		
		

		
		
		
	}

}
