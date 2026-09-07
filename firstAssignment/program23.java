//23.	Write a Java program to calculate the final price after applying a discount.
import java.util.Scanner;
public class program23{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double p, d, F;
    System.out.print("Enter price:");
    p=sc.nextDouble();
    System.out.print("Enter discount:");
    d=sc.nextDouble();
    
    F=p-((p/100)*d);
    System.out.println("Final price after discount:"+F);

  }
  
}