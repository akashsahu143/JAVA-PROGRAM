import java.util.*;
public class program12 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        String value1 = scanner.nextLine();

        System.out.print("Enter a digit: ");
        String value2 = scanner.nextLine();

        boolean areEqual =value1.equals(value2);

        if(areEqual){
            System.out.println("are equal.");
        }else{
            System.out.println("Not equal.");
        }
    }
}