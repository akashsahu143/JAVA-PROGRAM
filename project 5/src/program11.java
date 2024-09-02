import java.util.*;
public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();

        int integerNumber = (int) decimalNumber;

        System.out.println("The integer value is: " + integerNumber);
    }
}
