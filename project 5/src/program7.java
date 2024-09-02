import java.util.*;
public class program7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squreRoot = Math.sqrt(number);

        System.out.println("Squre root of "+number+" is " +squreRoot);
    }
}
