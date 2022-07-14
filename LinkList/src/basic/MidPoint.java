package basic;

public class MidPoint {
	
	public static Node<Integer> midPoint(Node<Integer> head){
		if(head.next==null || head ==null) {
			return head;
		}
		Node<Integer> slow=head;
		Node<Integer> fast=head.next;
		
		
		while (fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
		
	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> mid=midPoint(head);
		
		System.out.println(mid.data);

	}

}
