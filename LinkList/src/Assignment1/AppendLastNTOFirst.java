package Assignment1;

import basic.LinklistUse;
import basic.Node;

public class AppendLastNTOFirst {
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head,int n){
		
		int length=1;
		int count=0;
		Node<Integer> last=head;
		for (; last.next!=null; last=last.next) {
			length++;
		}
		
		
		last.next=head;
		
		Node<Integer> temp=head;
		n%=length;
		for (;count<=length-n ; temp=temp.next) {
			count++;
		}
		
		head=temp.next;
		temp.next=null;

		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead =appendLastNToFirst(head, 0);
		LinklistUse.printLinkList(newhead);
	}

}
