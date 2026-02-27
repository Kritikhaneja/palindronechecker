

public class PalindromeCheck {

    public static void main(String[] args) {

        // Original string (Data Structure: String)
        String original = "radar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String Concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Display reversed string
        System.out.println("Reversed String: " + reversed);
    }
}
