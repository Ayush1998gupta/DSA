package Assignment1;

import java.util.ArrayList;

import basic.LinklistUse;
import basic.Node;

public class printInreverse {
	
	public static void printReverse(Node<Integer> head) {
		ArrayList<Integer> arr=new ArrayList<>();
		
		for (Node<Integer> temp=head; temp!=null; temp=temp.next) {
			arr.add(temp.data);
		}
		
		for (int i = arr.size()-1; i >= 0; i--) {
			System.out.print(arr.get(i)+ " ");
		}
		
	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		printReverse(head);
		

	}

}
