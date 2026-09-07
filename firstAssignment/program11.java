//11.	Write a Java program to check whether a person is eligible to vote using logical operators.
import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        int y;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your age:");
        y=sc.nextInt();

        System.out.println("You are "+((y>=18 && y<130)?"eligible to vote":(y>=130?"eligible to vote (Assuming you are human)":"not eligible")));
    }
}
