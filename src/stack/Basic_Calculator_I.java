package stack;
import java.util.*;
public class Basic_Calculator_I {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        int num = 0;
        char operator = '+';

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Build number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // Operator or last character
            if ((!Character.isDigit(ch) && ch != ' ')
                    || i == s.length() - 1) {

                switch (operator) {

                    case '+':
                        stack.push(num);
                        break;

                    case '-':
                        stack.push(-num);
                        break;

                    case '*':
                        stack.push(stack.pop() * num);
                        break;

                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }

                operator = ch;
                num = 0;
            }
        }

        // Add everything in stack
        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
