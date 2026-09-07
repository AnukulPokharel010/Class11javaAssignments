//8.	Write a Java program to check whether a number is even or odd.
import java.util.Scanner;
public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.print("Enter a number:");
        n=sc.nextInt();

        System.out.println((n%2==0?"Even Number":"Odd Number"));
    }    
}
