//7.Write a Java program to swap two numbers without using a third variable.
import java.util.Scanner;
public class program7{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers:");
    a=sc.nextInt(); //a=10
    b=sc.nextInt(); //b=20
    System.out.println("Before Swapping: a= "+a+", b= "+b);

    a=a+b;  //a=30
    b=a-b;  //b=30-20=10 
    a=a-b;  //a=30-10=20

    /*
    Another way for swapping:

    a=a^b;
    b=a^b;
    a=a^b;

    */
   /*
   Another way for swapping: a=10, b=20
    NOTE: THIS WORKS UNTIL USER SENDS 0 IN EITHER
      a=a*b;  //a=200
      b=a/b;  //b=200/20=10
      a=a/b;  //a=200/10=20

   */

System.out.println("After Swapping: a= "+a+", b= "+b);

  }
  
}