import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number bitween 1 to 7 to get week: ");
        int dayNumber = scanner.nextInt();
        String day;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = " Oh Oh Wrong! Please enter a number between 1 and 7.";
                break;
        }
        System.out.println(day);
    }
}
