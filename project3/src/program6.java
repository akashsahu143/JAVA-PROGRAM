import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int number = 2;

        while (number <= limit) {
            sum += Math.pow(number, 3);
            number += 2;
        }


        System.out.println("The sum of the cubes of even numbers up to " + limit + " is: " + sum);
    }
}
