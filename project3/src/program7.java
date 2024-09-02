import java.util.*;
public class program7 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        int count = 1;

        System.out.println("The first 10 Fibonacci numbers are:");


        while (count <= 10) {
            System.out.print(n1 + " ");

            int nextNumber = n1 + n2;
            n1 = n2;
            n2 = nextNumber;

            count++;
        }
    }
}
