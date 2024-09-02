import java.util.Scanner;
public class program3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            String number1 = scanner.nextLine();

            System.out.print("Enter the second number: ");
            String number2 = scanner.nextLine();

            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);

            int sum = num1 + num2;

            System.out.println("The sum of the two numbers is: " + sum);
        }
    }


