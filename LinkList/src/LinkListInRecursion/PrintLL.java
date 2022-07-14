package LinkListInRecursion;

import basic.LinklistUse;
import basic.Node;

public class PrintLL {
	
	public static void printLL(Node<Integer> head) {
		if(head==null) {
			return;
		}
		
		System.out.print(head.data+" ");
		
		printLL(head.next);
		
	}
	
	public static void printReverseLL(Node<Integer> head) {
		if(head==null) {
			return;
		}
		printReverseLL(head.next);
		
		System.out.print(head.data+" ");
	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
//		printLL(head);
//		System.out.println();
		printReverseLL(head);
	}

}
