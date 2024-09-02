import java.util.*;
public class program3 {
    public static void main(String[] args) {
        int number = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                number = i;
                break;
            }
        }
        if (number != 0) {
            System.out.println("The first number divisible by both 3 and 7 is: " + number);
        } else {
            System.out.println("No number divisible by both 3 and 7 found within the range.");
        }
    }
}
