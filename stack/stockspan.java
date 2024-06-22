package stack;
import java.util.*;;
public class stockspan {
    public static int[] stockSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
      stack.push(0); // Push index 0 onto the stack
      int[] arr = new int[price.length];
      arr[0] = 1; // Span of the first day is always 1

      for (int j = 1; j < price.length; j++) {
          // Pop elements from stack while the stack is not empty and price[j] >= price of stack top
          while (!stack.isEmpty() && price[stack.peek()] < price[j]) {
              stack.pop();
          }

          // Calculate span
          arr[j] = stack.isEmpty() ? j + 1 : j - stack.peek();

          // Push current index onto the stack
          stack.push(j);
      }

      return arr;
    
}
}
