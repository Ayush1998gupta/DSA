package QueueUsingLL;

import queueUsingArrays.QueueEmptyException;

public class Use {

	public static void main(String[] args) {
		QueueUsingLinkList<Integer> queue=new QueueUsingLinkList<>();

		int arr[]= {10,20,30,40};
		for (int i : arr) {
			queue.enQueue(i);
		}
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.deQueue());
			} catch (QueueEmptyException e) {

			}
		}

	}

}
