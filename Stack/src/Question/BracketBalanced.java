package Question;

import java.util.Stack;

public class BracketBalanced {
	
	
	public static boolean isBalanced(String expression) {
		
		Stack<Character> stack= new Stack<>();
		
		for (int i = 0; i < expression.length(); i++) {
			
			switch (expression.charAt(i)) {
			case '{':
				stack.push(expression.charAt(i));
				break;

			case '}':
				if(stack.isEmpty()) {
					stack.push(expression.charAt(i));
					return false;
				}
				break;
			default:
				break;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
