package basic;

public class Print_ith_position {
	
	public static void printIthNode(Node<Integer> head , int i) {
		 int count =0;
	
		 Node<Integer> temp=head;
		 for (; temp!=null && count<i; temp=temp.next) {
				count++;
			}
		 
		 if(temp==null) {
			 return;
		 }
		 
		 System.out.println(temp.data);
	}
	
	
}
