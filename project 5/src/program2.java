import java.util.*;
public class program2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first sentence: ");
        String first = scanner.nextLine();

        System.out.print("Enter your second sentence: ");
        String second = scanner.nextLine();

        System.out.print("Enter your third sentence: ");
        String third = scanner.nextLine();

        System.out.print("Enter your fourth sentence: ");
        String fourth = scanner.nextLine();

        String fullsentence =(first +" "+second+" "+third+" "+fourth);

        System.out.println("Your full sentence: " +fullsentence);
    }
}
