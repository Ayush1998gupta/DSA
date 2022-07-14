package LinkListInRecursion;

import basic.LinklistUse;
import basic.Node;


class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	
	public DoubleNode() {
		
	}
	public DoubleNode(Node<Integer> head,Node<Integer> tail) {
		this.head=head;
		this.tail=tail;
	}
}

public class ReverseLL {
	
//	Not optimized
	public static Node<Integer> reverseLL1(Node<Integer> head){
//		Base Case
		if(head==null || head.next== null) {
			return head;
		}
//		Recursion call
		Node<Integer> smallHead= reverseLL1(head.next);
		
//		
		 Node<Integer> tail=smallHead;
		 for (; tail.next!=null; tail=tail.next) {	
			}
		 
		 tail.next=head;
		 head.next=null;

		return smallHead;
	}
	
	

	
	public static Node<Integer> reverseLL2(Node<Integer> head){
//		Base Case
		if(head==null || head.next== null) {
			return head;
		}
//		Recursion call
		Node<Integer> smallHead= reverseLL2(head.next);
		
		
		head.next.next=head;
		head.next=null;
		
		return smallHead;
	}
	

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead=reverseLL1(head);
		LinklistUse.printLinkList(newhead);

	}

}
