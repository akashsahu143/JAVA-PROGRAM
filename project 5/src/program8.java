import java.util.*;
public class program8 {
    public static void main(String[] args){
        Random random = new Random();

        int randomnumber = random.nextInt(100)+1;

        System.out.println("Random number between 1 to 100: " +randomnumber);
    }
}
