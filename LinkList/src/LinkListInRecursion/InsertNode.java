package LinkListInRecursion;

import basic.LinklistUse;
import basic.Node;

public class InsertNode {

	public static Node<Integer> insertNodeAt(Node<Integer> head,int data,int pos){

		if(head==null && pos>0) {
			return head;
		}
		if(pos==0) {
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next=head;
			return newNode;
		}else{
			head.next=insertNodeAt(head.next, data, pos-1);
			return head;
		}

	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead=insertNodeAt(head, 20, 3);
		LinklistUse.printLinkList(newhead);

	}

}
