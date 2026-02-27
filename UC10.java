// Goal: Ignore spaces and case while checking a palindrome

public class PalindromeIgnoreCase {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Apply palindrome logic
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("The string \"" + text + "\" is a Palindrome (ignoring spaces & case).");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
