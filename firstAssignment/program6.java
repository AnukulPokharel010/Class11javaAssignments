//6. Write a Java program to swap two numbers using a third variable.
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two numbers:");
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();

        System.out.println("\nSwapping the numbers..");

        c=a;
        a=b;
        b=c;

        System.out.println("Result after swapping:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
