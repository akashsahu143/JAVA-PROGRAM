import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        //enter the no. 0
        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            number = scanner.nextInt();
            //enter 0 to exit
            if (number == 0) {
                break;
            }
            //add two +ve no.
            if (number > 0) {
                sum += number;
            }
        }
        //print total no.0
        System.out.println("Sum of positive integers: " + sum);
        scanner.close();
    }
}
