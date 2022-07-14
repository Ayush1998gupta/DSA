package dynamicArray;

public class Use {

	public static void main(String[] args) {
		
		DynamicArray d=new DynamicArray();
		
		
//		Insert elements at the end
//		d.add(100);
//		Get the size of the Array
//		d.size();
//		Read the element at paticular position
//		d.get(2);
//		Insert the element at the ith position
//		d.set(3,170);
//		this return boolean 
//		d.isEmpty();
		
		for (int i = 1; i <=11; i++) {
			d.add(i);
		}
		System.out.println(d.size());
		for (int i = 0; i < d.size(); i++) {
			System.out.print(d.get(i)+" ");
		}
		
	}

}
