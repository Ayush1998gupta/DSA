package Assignment2;

import basic.LinklistUse;
import basic.Node;
import basic.TakingInput;

public class MregeTwoSortedLL {
	
	public static Node<Integer> mergeSortedLL(Node<Integer> head1,Node<Integer> head2){
	
		if(head1==null) {
			return head2;
		}
		
		if(head2==null) {
			return head1;
		}
		Node<Integer> newHead=null;
		Node<Integer> tail=null;
		
		if(head1.data<head2.data) {
			newHead=head1;
			tail=head1;
			head1=head1.next;
		}else {
			newHead=head2;
			tail=head2;
			head2=head2.next;
		}
		
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				tail.next=head1;
				head1=head1.next;
				tail=tail.next;
			}else {
				tail.next=head2;
				head2=head2.next;
				tail=tail.next;
			}
		}
		
		if(head2!=null) {
			tail.next=head2;
		}

		if(head1!=null) {
			tail.next=head1;
		}
		
		
		
		return newHead;	
	}

	public static void main(String[] args) {
		
		Node<Integer> head1= TakingInput.takeInput2();
		LinklistUse.printLinkList(head1);
		


	}

	

}
