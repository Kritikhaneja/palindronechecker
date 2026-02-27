

import java.util.*;

public class PalindromePerformance {

  
    public static boolean reverseMethod(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

   
    public static boolean stackMethod(String text) {
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

   
    public static boolean twoPointerMethod(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

       
        long startTime = System.nanoTime();
        boolean r1 = reverseMethod(word);
        long endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

      
        startTime = System.nanoTime();
        boolean r2 = stackMethod(word);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

     
        startTime = System.nanoTime();
        boolean r3 = twoPointerMethod(word);
        endTime = System.nanoTime();
        long pointerTime = endTime - startTime;

        
        System.out.println("Word: " + word);
        System.out.println("Reverse Method Result: " + r1 + " | Time: " + reverseTime + " ns");
        System.out.println("Stack Method Result: " + r2 + " | Time: " + stackTime + " ns");
        System.out.println("Two Pointer Result: " + r3 + " | Time: " + pointerTime + " ns");
    }
}
