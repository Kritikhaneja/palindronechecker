

public class PalindromeReverse {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String Concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Display reversed string (optional)
        System.out.println("Reversed String: " + reversed);
    }
}
