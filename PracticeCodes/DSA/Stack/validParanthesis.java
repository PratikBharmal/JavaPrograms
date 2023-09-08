package DSA.Stack;

import java.util.*;


public class validParanthesis {
    public static boolean checkValid(String str) {
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];

            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                st.push(currentChar);
            } else if (currentChar == '}' || currentChar == ']' || currentChar == ')') {
                if (st.isEmpty()) {
                    return false; // No matching opening bracket found
                }

                char topChar = st.pop();

                if ((currentChar == '}' && topChar != '{') ||
                    (currentChar == ']' && topChar != '[') ||
                    (currentChar == ')' && topChar != '(')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // After processing all characters, the stack should be empty if brackets are balanced
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()}";
        boolean isValid = checkValid(str);
        
        if (isValid) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }
}
