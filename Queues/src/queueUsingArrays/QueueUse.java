package queueUsingArrays;

public class QueueUse {

	public static void main(String[] args) {
		QueueUsingArrays queue=new QueueUsingArrays();
		int arr[]= {10,20,30,40};
		for (int i : arr) {
			try {
				queue.enQueue(i);
			} catch (QueueFullException e) {
				
			}
			while (!queue.isEmpty()) {
				try {
					System.out.println(queue.deQueue());
				} catch (QueueEmptyException e) {
					
				}
			}
		}

	}

}
