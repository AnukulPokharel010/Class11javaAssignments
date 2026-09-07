//19.	Write a Java program to check whether a number is divisible by both 5 and 11.
import java.util.Scanner;
public class program19{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n;
    System.out.print("Enter a number to check:");
    n=sc.nextDouble();
    
    System.out.println((n%5==0 && n%11==0?"The number is divisible by both 5 and 11":"The number is not divisible by both 5 and 11"));
  }
  
}