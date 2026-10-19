//1.	Write a Java program that uses a parameterized constructor to initialize object values.

    class test{

    int age;
    
    test(int a) {

        age=a;

    }

    protected void display() {

        System.out.println("Age="+age);
    
    }

   } 

public class program1 {

   void main(String[] args)  {
    
    test t=new test(15);
    t.display();
   }
}
