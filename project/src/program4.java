import java.util.*;

public class program4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        long factorial = factorial(number);


        System.out.println("The factorial of " + number + " is " + factorial);


        scanner.close();
    }


    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

