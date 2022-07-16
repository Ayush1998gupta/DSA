package StackUsingLL;

import stackUsingArrays.StackEmptyException;

public class Use {

	public static void main(String[] args) throws StackEmptyException {
		
		StackUsingLinkList<Integer> stack=new StackUsingLinkList<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		

		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		

	}

}
