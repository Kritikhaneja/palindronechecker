// Goal: Choose a palindrome algorithm dynamically using Strategy Pattern

import java.util.*;


interface PalindromeStrategy {
    boolean isPalindrome(String text);
}


class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for (char ch : text.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : text.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : text.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}


class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        return strategy.isPalindrome(text);
    }
}


public class MainApp {

    public static void main(String[] args) {

        String word = "racecar";

        PalindromeChecker checker = new PalindromeChecker();

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // You can switch to:
        // PalindromeStrategy strategy = new DequeStrategy();

        checker.setStrategy(strategy);

        boolean result = checker.check(word);

        if (result) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
