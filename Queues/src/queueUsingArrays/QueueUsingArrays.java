package queueUsingArrays;

import java.awt.Font;

public class QueueUsingArrays {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	
	public QueueUsingArrays() {
		data=new int [5];
		front=-1;
		rear=-1;
	}
	
	public QueueUsingArrays(int capacity) {
		data=new int [capacity];
		front=-1;
		rear=-1;
	}

	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int front() throws QueueEmptyException  {
		
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public void enQueue(int elem) throws QueueFullException {
		if(size==data.length) {
			throw new QueueFullException();
		}
		if(size==0) {
			front =0;
		}
//		rear++;
		rear=(rear+1)%data.length;
		
		data[rear]=elem;
		size++;
	}
	
	public int deQueue() throws QueueEmptyException {
		
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
//		front++;
//		if(front==data.length) {
//			front=0;
//		}
		front=(front+1)%data.length;
		
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		
		return temp;
	}
	
	
	
	
	
	
	
	
}
