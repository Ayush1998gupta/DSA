package generics;

public class Student implements PrintInterface{

	int rollnumber;
	
	

	public Student(int rollnumber) {
		this.rollnumber = rollnumber;
	}



	@Override
	public void print() {
		System.out.print(rollnumber+" ");
		
	}
}
