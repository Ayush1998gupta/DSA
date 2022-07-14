package generics;

public class Vehicle implements PrintInterface {
	
	int maxSpeed;
	String company;
	
	
	public Vehicle(int maxSpeed, String company) {
		this.maxSpeed = maxSpeed;
		this.company = company;
	}


	@Override
	public void print() {
		System.out.println(maxSpeed+" "+company);
		
	}
	
	
	
	

}
