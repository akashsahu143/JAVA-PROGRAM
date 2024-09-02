import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  sentence");
        String sentence = scanner.nextLine();

        String longestWord = "";
        String[] words = sentence.split("//s+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            System.out.println("The longest word is: " + longestWord);
        }
    }
}
