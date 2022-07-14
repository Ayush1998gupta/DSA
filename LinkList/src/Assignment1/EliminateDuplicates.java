package Assignment1;

import basic.LinklistUse;
import basic.Node;

public class EliminateDuplicates {


	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(1);
		Node<Integer> n2=new Node<Integer>(2);
		Node<Integer> n3=new Node<Integer>(3);
		Node<Integer> n4=new Node<Integer>(3);
		Node<Integer> n5=new Node<Integer>(3);
		Node<Integer> n6=new Node<Integer>(3);
		//		Node<Integer> n7=new Node<Integer>(4);
		//		Node<Integer> n8=new Node<Integer>(4);
		//		Node<Integer> n9=new Node<Integer>(4);
		//		Node<Integer> n10=new Node<Integer>(5);
		//		Node<Integer> n11=new Node<Integer>(5);
		//		Node<Integer> n12=new Node<Integer>(7);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		//		n6.next=n7;
		//		n7.next=n8;
		//		n8.next=n9;
		//		n9.next=n10;
		//		n10.next=n11;
		//		n11.next=n12;
		return n1;
	}

	public static Node<Integer> removeDupicates(Node<Integer> head){

		if(head==null) {
			return head;
		}

		Node<Integer> t1=head;
		Node<Integer> t2=t1.next;

		while (t2!=null) {
			if(t1.data==t2.data) {
				t2=t2.next;
			}else  {
				t1.next=t2;
				t1=t1.next;
				t2=t2.next;
			}
		}
		return head;
	}

	public static Node<Integer> removeDuplicates(Node<Integer> head) { 
		if (head == null) {
			return head; 
		}   
//		Node<Integer> currHead = head;  
		Node<Integer> t1=head;
		
		while (t1.next != null) {
			if (t1.data.equals(t1.next.data)) {
				t1.next = t1.next.next;
			} else {  
				t1 = t1.next; 
			}  



		}    return head;  
	}

	public static void main(String[] args) {
		Node<Integer> head= createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead =removeDuplicates(head);
		LinklistUse.printLinkList(newhead);
	}
}
