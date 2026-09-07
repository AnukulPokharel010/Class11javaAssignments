//9.	Write a Java program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.print("Enter a number:");
        n=sc.nextInt();

        System.out.println((n>0?"Positive Number":(n<0?"Negative number":"It is zero")));
    }
}
