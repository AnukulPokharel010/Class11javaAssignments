//25.	Write a Java program to calculate the total cost of items using quantity and price.
import java.util.Scanner;
public class program25{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double q, p, T;
    System.out.print("Enter price:");
    p=sc.nextDouble();
    System.out.print("Enter quantity:");
    q=sc.nextDouble();
    T=q*p;
    System.out.println("Total cost of the item:"+T);
  }
  
}