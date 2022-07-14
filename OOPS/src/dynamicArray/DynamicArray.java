package dynamicArray;

public class DynamicArray {
	private int data[];
	private int nextElementIndex;
	
	public DynamicArray() {
		data=new int[5];
		nextElementIndex=0;
	}

	public int size() {
		return this.nextElementIndex;
	}

	public boolean isEmpty() {
		return this.nextElementIndex==0;
		
	}

	public int get(int i) {
		
		if(i>=nextElementIndex) {
//			throw Error
			return -1;
		}
		return data[i];
		
	}

	public void add(int num) {
		if(nextElementIndex==data.length) {
			doubleCapacity();
		}
		
		data[nextElementIndex]=num;
		nextElementIndex++;
	}

	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		
		for (int i = 0; i < temp.length; i++) {
			data[i]=temp[i];
		}
	}

	public void set(int i, int element) {
		if(i>=nextElementIndex) {
//			throw Error
			return ;
		}
		data[i]=element;
	}
	
	public int removeLast() {
		if(nextElementIndex==0) {
			
			return -1;
		}
		
		int temp=data[nextElementIndex-1];
		nextElementIndex--;
		return temp;
	}
	
	
	
}
