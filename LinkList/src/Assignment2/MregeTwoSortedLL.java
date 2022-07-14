package Assignment2;

import basic.LinklistUse;
import basic.Node;
import basic.TakingInput;

public class MregeTwoSortedLL {
	
	public static Node<Integer> mergeSortedLL(Node<Integer> head1,Node<Integer> head2){
	
		Node<Integer> newHead=null;
		
		if(head1.data<head2.data) {
			newHead=head1;
			head1=head1.next;
			newHead.next=head2;
			head2=head2.next;
		}
		
		
		
		return newHead;	
	}

	public static void main(String[] args) {
		
		Node<Integer> head1= TakingInput.takeInput2();
		LinklistUse.printLinkList(head1);
		


	}

	

}
