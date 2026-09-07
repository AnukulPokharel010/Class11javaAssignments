//22.	Write a Java program to determine whether a year is a leap year using logical and relational operators.
import java.util.Scanner;
public class program22{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int y;
    System.out.print("Enter year:");
    y=sc.nextInt();

    System.out.println((((y%4==0 && y%100!=0)||(y%400==0))?"It is Leap Year":"It is not leap year"));

  }
  
}