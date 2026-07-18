package practice.javaprogram;
//StringPalindrome
public class Program3 {
    public static void main(String[] args) {

        String original = "madam";

        // Stores reversed string
        String reverse = "";

        // Start from last character
        for (int i = original.length() - 1; i >= 0; i--) {

            // Add each character in reverse order
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Given string is: " + original);
        // Compare original and reversed strings
        if (original.equals(reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
    }
}
