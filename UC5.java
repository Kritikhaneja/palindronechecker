// Goal: Use stack to reverse characters and validate palindrome

import java.util.Stack;

public class PalindromeStack {

    public static void main(String[] args) {

        // Original String
        String text = "level";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));   // Push Operation
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < text.length(); i++) {
            char poppedChar = stack.pop();   // Pop Operation

            if (text.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
