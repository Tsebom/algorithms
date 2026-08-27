package org.tsebom.let_code.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char parenthese = s.charAt(i);

            switch (parenthese) {
                case '(':
                case '[':
                case '{':
                    stack.push(parenthese);
                    continue;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        continue;
                    } else{
                    return false;
                    }
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        continue;
                    } else{
                        return false;
                    }
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else{
                        return false;
                    }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValid("(]"));
        System.out.println(validParentheses.isValid("(("));
    }
}
