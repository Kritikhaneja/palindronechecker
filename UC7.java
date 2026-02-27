

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeDeque {

    public static void main(String[] args) {

        // Original String
        String text = "racecar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));   // Insert at rear
        }

        boolean isPalindrome = true;

        // Remove first and last elements and compare
        while (deque.size() > 1) {

            char front = deque.removeFirst(); // Remove from front
            char rear = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
