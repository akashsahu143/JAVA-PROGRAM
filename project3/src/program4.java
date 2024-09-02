import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbersSet = new HashSet<>();
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (numbersSet.contains(number)) {
                System.out.println("Duplicate number detected: " + number);
                break;
            }
            numbersSet.add(number);
        }
        scanner.close();
    }
}
