//18.	Write a Java program to calculate the square and cube of a number.
import java.util.Scanner;
public class program18{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n;
    System.out.print("Enter a number:");
    n=sc.nextDouble();

    System.out.println("Square of the number="+(Math.pow(n,2)));
    System.out.println("Cube of the number="+(Math.pow(n,3)));

  }
  
}