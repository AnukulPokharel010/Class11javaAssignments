//13.	Write a Java program to check whether a student has passed or failed using the conditional operator.
import java.util.Scanner;
public class program13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks:");
        marks=sc.nextInt();
        
        System.out.println((marks>=40 && marks<=100?"Passed!":(marks>100)?"Invalid marks":"Failed"));
    }
}