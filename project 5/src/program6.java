import java.util.*;
public class program6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your State: ");
        String state = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your city zipcode: ");
        String zipcode = scanner.nextLine();

        String address = state +"\n" + city +" "+zipcode;

        System.out.println("formated address: " + address);


    }
}
