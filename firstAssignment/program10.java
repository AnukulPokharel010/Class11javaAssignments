//10.	Write a Java program to find the greater of two numbers using the relational operator.
import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers to check which is greater:");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println((a>b?"First number is Greater":"Second number is Greater"));

    }
}
