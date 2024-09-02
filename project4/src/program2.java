import java.util.*;
public class program2 {
    public static void main(String[] args) {
        String input = "Aka ";
        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean checkPalindrome(String str) {
        String cleanedStr = str.toLowerCase().replaceAll("\\s", "");
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
