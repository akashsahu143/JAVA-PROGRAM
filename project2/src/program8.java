import java.util.*;

public class program8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the 3rd number: ");
        int num3 = scanner.nextInt();

        int largest = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;

        System.out.println("1st Number = " + num1);
        System.out.println("2nd Number = " + num2);
        System.out.println("3rd Number = " + num3);
        System.out.println("The " + (largest == num1 ? "1st" : largest == num2 ? "2nd" : "3rd") + " Number is the greatest among three.");

        scanner.close();
    }
}
