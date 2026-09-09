//16. Write a Java program to convert Celsius temperature into Fahrenheit.
import java.util.Scanner;
public class program16{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double Celsius, fahrenheit;

    System.out.print("Enter celsius temperature:");
    Celsius=sc.nextDouble();

    fahrenheit=((9.00000*Celsius)/5.00000)+32.00000;

    // celsius=5/9*(f-32)

    System.out.println("Into fahrenheit: "+fahrenheit);
  }
  
}