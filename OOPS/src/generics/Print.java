package generics;



public class Print {
	
	public static <T extends PrintInterface> void printArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
//			System.out.print(arr[i]+" ");
		}
	}
	
	public static <T> void printArray(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Integer [] arr= {5,6,9,3,5,3};
		printArray(arr);
		System.out.println();
		String [] str= {"a","b","c"};
		printArray(str);
		
		System.out.println();
		
		Vehicle v[]=new Vehicle[5];
		
		for (int i = 0; i < v.length; i++) {
			v[i]=new  Vehicle(10,"abc");
		}
		
		printArray(v);
		
		Student s[]=new Student[4];
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Student(1);
		}
		
		printArray(s);
		
		
	}
	
	
	

}
