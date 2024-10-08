package collectionsJoce;

import java.util.Stack;

public class BracketChecker {

	private String input;
	
	public BracketChecker(String input) {
		this.input = input;
	}
	
	public boolean check() {		
		Stack<Character> stack = new Stack<>();		
		for(char c : input.toCharArray()) {
			if(c =='(' || c == '[' || c == '{') {
				stack.push(c);
			}else if (c ==')' || c == ']' || c == '}') {
				if(stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
					return false;
				}
			}
		}		
		return stack.isEmpty();
	}
	
	public boolean isMatchingPair(char open, char close) {
		return (open =='(' && close == ')') || 
				(open =='[' && close == ']')||
				(open =='{' && close == '}');
	}
	
}
