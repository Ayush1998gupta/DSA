package basic;

public class LinklistUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node<Integer>(2);
		Node<Integer> n2=new Node<Integer>(8);
		Node<Integer> n3=new Node<Integer>(10);
		Node<Integer> n4=new Node<Integer>(15);
		Node<Integer> n5=new Node<Integer>(25);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	
	
	
	public static void printLinkList(Node<Integer> head) {
		Node<Integer> temp=head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
//		for (Node<Integer> temp=head; temp!=null; temp=temp.next) {
//			System.out.print(temp.data+" ");
//		}
		
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Node<Integer> head=  TakingInput.takeInput1();//createLinkedList();
		printLinkList(head);
		System.out.println(LengthOfLL.length(head));
//		Print_ith_position.printIthNode(head, 3);

	}

}
