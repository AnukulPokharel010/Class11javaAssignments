//3.Write a Java program to calculate the area and perimeter of a rectangle.
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double l, b, P, A;

        System.out.print("Enter Length of rectangle:");
        l=sc.nextDouble();

        System.out.print("Enter Breadth of rectangle:");
        b=sc.nextDouble();

        P=2*(l+b);
        A=l*b;

        System.out.println("Area of rectangle="+A);
        System.out.println("Perimeter of rectangle="+P);
    }
}
