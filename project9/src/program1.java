import java.util.*;
public class program1 {
        public static void main(String args[]){
            double radius;
            System.out.println("enter the radius of the circle");
            Scanner sc = new Scanner(System.in);
            radius = sc.nextDouble();
            double area = CalculateArea(radius);
            System.out.println("The area of the circle is : "+area);
        }
        public static double CalculateArea(double radius){
            return Math.PI * Math.pow(radius,2);
        }
    }
