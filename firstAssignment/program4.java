//4.	Write a Java program to calculate the area and circumference of a circle.
import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r,C,A;
        System.out.println("Enter radius of the circle:");
        r=sc.nextDouble();

        A=Math.PI*Math.pow(r,2.0);
        C=2*Math.PI*r;
        
        System.out.println("Area of the circle: "+String.format("%.4f", A));
        System.out.println((String.format("Circumference of the Circle:%.4f", C)));
        //String.format is for formatting it to 4 decimal places.
    }
}


/* 4 integer places another option
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, C, A;

        System.out.print("Enter radius of the circle: ");
        r = sc.nextDouble();

        A = Math.PI * Math.pow(r, 2.0);
        C = 2 * Math.PI * r;

        System.out.printf("Area of the circle: %.4f%n", A);
        System.out.printf("Circumference of the circle: %.4f%n", C);

        sc.close();
    }
} 


*/