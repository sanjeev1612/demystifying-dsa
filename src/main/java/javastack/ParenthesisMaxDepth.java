package javastack;

import java.util.Stack;

public class ParenthesisMaxDepth {
  public static void main(String[] args) {
    String input = "1";
    System.out.println(maxDepth(input));
  }

  public static int maxDepth(String s) {
    int maxDepth_result = 0;
    int max_Depth_current = 0;
    Stack<Character> charStack = new Stack<Character>();
    char[] charArray = s.toCharArray();
    for (char c : charArray) {
      if (c == '(' || c == ')') {
        charStack.push(c);
      }
    }

    while (!charStack.isEmpty()) {
      char current = charStack.pop();
      if (current == ')') {
        max_Depth_current++;
      } else {
        max_Depth_current--;
        continue;
      }
      if (max_Depth_current > maxDepth_result) {
        maxDepth_result = max_Depth_current;
      }
    }

    return maxDepth_result;
  }
}
