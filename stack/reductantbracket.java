package stack;

 import java.util.*;
public class reductantbracket{

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		 Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == ')') {
                // Pop elements until '(' is found
                boolean operatorFound = false;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        operatorFound = true;
                    }
                }
                
                // If '(' not found after popping, it indicates redundant brackets
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Pop '('
                    if (!operatorFound) {
                        return true; // Redundant brackets found
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        
        return false;

		
	}
} 
    

