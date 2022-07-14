package basic;

public class LengthOfLL {

	public static int length(Node<Integer> head) {

		int count =0;

		for (Node<Integer> temp=head; temp!=null; temp=temp.next) {
			count++;
		}

		return count;
	}

}
