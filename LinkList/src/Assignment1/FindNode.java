package Assignment1;

import basic.Node;

public class FindNode {

	public static int findNode(Node<Integer> head, int n) {
		int count=0;
		for (Node<Integer> temp=head; temp!=null; temp=temp.next) {
			if(temp.data==n) {
				return count;
			}
			count++;
		}

		return -1;
	}
}
