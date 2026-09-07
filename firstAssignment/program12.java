//12.	Write a Java program to check whether a number lies between 10 and 100.
import java.util.Scanner;
public class program12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        System.out.println((n>=10 && n<=100?"It lies between 10 and 100":"It doesn't lie` between 10 and 100"));


    }
}