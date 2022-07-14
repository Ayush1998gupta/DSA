package basic;

public class DeleteNode {


	public static Node<Integer> deleteNodeAt(Node<Integer> head ,int pos) {

		if(head==null) {
			return head;
		}
		int count=0;
		Node<Integer> temp=head;
		if(pos==0) {
			return head.next;
		}else {
			for (; temp!=null && count<pos-1; temp=temp.next) {
				count++;
			}
			if(temp!=null && temp.next!=null) {
				temp.next=temp.next.next;
			}
			return head;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead =deleteNodeAt(head, 7);
		LinklistUse.printLinkList(newhead);
	}

}

