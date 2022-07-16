package StackUsingLL;

import stackUsingArrays.StackEmptyException;

public class StackUsingLinkList<T> {

	private Node<T> head;
	private int size;

	//	public StackUsingLinkList() {
	//		head=null;
	//		size=0;
	//	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}


	public void push(T elem) {
		
		Node<T> newNode=new Node<T>(elem);
		newNode.next=head;
		head=newNode;
		size++;

	}

	public  T top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
	}

	public  T pop() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		T value=head.data;
		head=head.next;
		size--;
		return value;
		
	}





}
