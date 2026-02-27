// Goal: Demonstrate FIFO vs LIFO using Queue and Stack

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class FIFOvsLIFO {

    public static void main(String[] args) {

        // Original String
        String text = "madam";

        // Create Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);   // Enqueue Operation
            stack.push(ch);  // Push Operation
        }

        boolean isPalindrome = true;

        // Compare Dequeue (FIFO) vs Pop (LIFO)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
