//15.	Write a Java program to calculate the total and percentage of five subjects.
import java.util.Scanner;
public class program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, c, d, e, T, P;
        System.out.println("Enter marks of 5 subjects(out of 100):");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        T=a+b+c+d+e;
        P=T/5;

        System.out.println("Total marks of the Subjects:"+T);
        System.out.println("Percentage fo the Subjects: "+P+"%");

    }
}
