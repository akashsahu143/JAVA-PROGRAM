import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = number;

        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
