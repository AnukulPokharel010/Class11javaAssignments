//Write a Java program to add, subtract, multiply, and divide two numbers.
import java.util.Scanner;
public class program1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double a, b, add, sub, mul;

        System.out.println("Enter two numbers:");

        System.out.print("a=");
        a=sc.nextDouble();
        System.out.print("b=");
         b=sc.nextDouble();

         add=a+b;
         sub=a-b;
         mul=a*b;
         
         System.out.println("Addition="+add);
         System.out.println("Subtraction a-b="+sub);
         System.out.println("Multiply="+mul);

         System.out.println((b==0?"ERROR!.....Denominator can't be 0":("Division of the numbers is "+a/b)));

         // if(b==0) {
         //    System.out.println("\n ERROR... denominator can't be 0");
         // } else {
         //    System.out.println("Division a/b="+(a/b));
         // }
         
         //Syntax of ternary: (condition)?True:False
    }
}
