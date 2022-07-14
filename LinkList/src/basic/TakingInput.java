package basic;

import java.util.Scanner;

public class TakingInput {

	public static Node<Integer> takeInput1(){
		Node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			Node<Integer> currentNode =new Node<Integer>(data);
		
			if(head==null) {
//				make this to head node
				head=currentNode;
			}else {
				Node<Integer> tail=head;
				while (tail.next!=null) {
					tail=tail.next;
				}
//				Now tail is in last node
//				connectv current node after last node
				tail.next=currentNode;
			}	
			data=s.nextInt();
		}
		s.close();
		return head;
	}
	
//	Optimize Code for taking input
	
	public static Node<Integer> takeInput2(){
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			Node<Integer> currentNode =new Node<Integer>(data);
		
			if(head==null) {
//				make this to head node
				head=currentNode;
				tail=currentNode;
			}else {
				tail.next=currentNode;
				tail=tail.next;
			}	
			data=s.nextInt();
		}
		s.close();
		return head;
	}
	

}
