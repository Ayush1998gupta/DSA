package QueueUsingLL;

import queueUsingArrays.QueueEmptyException;

public class QueueUsingLinkList<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueUsingLinkList() {
		front=null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
		
	}
	public boolean isEmpty() {
		return size==0;
		
	}
	
	public T front() throws QueueEmptyException{
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		return front.data;
	}
	
	public void enQueue(T elem) {
		Node<T> newNode=new Node<>(elem);
		size++;
		
		if(rear==null) {
			front=newNode;
			rear=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
		
	}
	
	public T deQueue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		T temp=front.data;
		front = front.next;
		if(front==null) {
			rear=null;
		}
		size--;
		return temp;
	}

}
