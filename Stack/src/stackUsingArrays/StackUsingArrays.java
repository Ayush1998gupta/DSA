package stackUsingArrays;

public class StackUsingArrays {

	private int data[];
	private int topIndex;

	public StackUsingArrays() {
		data=new int[2];
		topIndex=-1;
	}
	
	public StackUsingArrays(int size) {
		data=new int[size];
		topIndex=-1;
	}
	
	private void doubleCapacity() {
		System.out.println("Double");
		int temp []=data;
		data=new int [2*temp.length];
		
		for (int i = 0; i < temp.length; i++) {
			data[i]=temp[i];
		}
		
	}
	

//	O(1)
	public void push(int elem) {
		if(data.length-1==topIndex) {
			doubleCapacity();
		}
		data[++topIndex]=elem;

	}

	//	O(1)
	public int pop() throws StackEmptyException {
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
//		int value=data[topIndex];
//		topIndex--;
//		return value;
		return data[topIndex--];
	}

//	O(1)
	public int top() throws StackEmptyException {
		if(topIndex==-1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}

//	O(1)
	public int size() {
		return topIndex+1;
	}
	
//	O(1)
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}
		return false;
	}

}
