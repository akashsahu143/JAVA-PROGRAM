import java.util.*;
public class program9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number= scanner.nextDouble();

        boolean isGreaterThen100 = number > 100;

        if (isGreaterThen100){
            System.out.println("The number is "+ number +" greater then 100: ");
        }else{
            System.out.println("Then number is "+ number + " not greater then 100");
        }
    }
}
