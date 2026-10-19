// 4.	Write a program to show that a constructor is called automatically when an object is created.
class test{
    test() {
        System.out.print("Constructor created");
    }
}
public class program3 {
    public static void main(String[] args) {
    test t=new test();
    }
    
}
