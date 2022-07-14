package basic;

public class NodeAt_Nth_Psition {


	public static Node<Integer>  atPosition(Node<Integer> head ,int pos){
		Node<Integer> newNode=new Node<Integer>(20);
		Node<Integer> temp=head;
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}else {
			int count=0;
			for (; temp!=null && count<pos-1; temp=temp.next) {
				count++;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			return head;
		}

	}

	public static void main(String[] args) {
		Node<Integer> head= LinklistUse.createLinkedList() ;
		LinklistUse.printLinkList(head);
		Node<Integer> newhead =atPosition(head, 0);
		LinklistUse.printLinkList(newhead);
	}

}
