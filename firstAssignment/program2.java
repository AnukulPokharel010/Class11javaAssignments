//2.Write a Java program to find the remainder of two numbers using the modulus operator.
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println((b==0?"ERROR!... Denominator can't be 0":("Remainder of first number divided by second is="+(a%b))));
        
        //Syntax of ternary: (condition)?True:False
    }
}
