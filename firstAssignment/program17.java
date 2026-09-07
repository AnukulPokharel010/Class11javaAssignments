//17.	Write a Java program to calculate simple interest.

import java.util.Scanner;
public class program17 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int p, t, r, SI;

    System.out.println("Enter Principal:");
    p=sc.nextInt();
    System.out.println("Enter Rate of Interest:");
    r=sc.nextInt();
    System.out.println("Enter Time:");
    t=sc.nextInt();

    SI=(p*t*r)/100;
    System.out.println("Simple Interest is:RS. "+SI);
  }
  
}