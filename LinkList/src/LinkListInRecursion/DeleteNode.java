package LinkListInRecursion;

import basic.LinklistUse;
import basic.Node;

public class DeleteNode {
	
	
	public static Node<Integer> deleteNodeAt(Node<Integer> head ,int pos){
		
		if(head==null) {
			return head;
		}
		
		if(pos==0) {
			return head.next;
		}else {
			Node<Integer> smallOP=deleteNodeAt(head.next, pos-1);
			head.next=smallOP;
			return head;
		}
		
		
		
	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead=deleteNodeAt(head, 2);
		LinklistUse.printLinkList(newhead);

	}

}
