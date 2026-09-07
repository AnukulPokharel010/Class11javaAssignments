//5. Write a Java program to calculate the average of three numbers.
import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("Average of the give numbers is :"+((a+b+c)/3));
    }
}
