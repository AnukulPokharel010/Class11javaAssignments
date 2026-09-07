//14.	Write a Java program to demonstrate all compound assignment operators.
import java.util.Scanner;
public class program14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter two numbers:");
        a=sc.nextDouble(); //a=10
        b=sc.nextDouble();  //b=20
        
        System.out.println("Entered numbers are: a="+a+" b="+b);

        a+=b;  //a=10+20    a=30
        System.out.println("a+=b:"+a);
        a-=b;   //a=30-20    a=10
        System.out.println("a-=b:"+a);
        a*=b;   //a=10*20   //a=200
        System.out.println("a*=b:"+a);
        a/=b;   //a=200/20  a=10
        System.out.println("a/=b:"+a);
        a%=b;   //a=10%20   a=10
        System.out.println("a%=b:"+a);

    }
}