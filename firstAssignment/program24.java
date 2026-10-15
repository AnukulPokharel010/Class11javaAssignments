// 24. Write a Java program to calculate an employee's salary after adding an allowance and deducting tax.
import java.util.Scanner;
public class program24{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double base, allowance, tax, afterAllowance, total;

    System.out.print("Enter basic salary:");
    base=sc.nextDouble();

    System.out.print("Enter allowance% of salary:");
    allowance=sc.nextDouble();

    System.out.print("Enter tax rate(%):");
    tax=sc.nextDouble();

    afterAllowance=base+((base/100)*allowance);
    total=afterAllowance-((afterAllowance/100)*tax);

    System.out.println("Final salary:"+total);
  }
  
}