

public class PalindromeHardcoded {

    // Main Method – Entry point of the program
    public static void main(String[] args) {

        // Hardcoded String (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Logic to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional Statement to check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program Exit Message
        System.out.println("Program finished.");
    }
}
