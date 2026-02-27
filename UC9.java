// Goal: Check palindrome using recursion

public class PalindromeRecursion {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String text, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // Compare characters at start and end
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call for next smaller substring
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "level";

        // Call recursive function
        boolean result = isPalindrome(text, 0, text.length() - 1);

        // Display result
        if (result) {
            System.out.println("The string \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
