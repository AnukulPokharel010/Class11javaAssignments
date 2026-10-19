// 6.	Write a Java program to demonstrate single inheritance.
class parent{
    void parentMethod() {
        System.out.println("hello from parent");
    }
}
class child extends parent{
    void childMethod() {
        System.out.println("Hello from child");
    }
}
public class program6 {
    public static void main(String[] args) {

        child c=new child();
        c.parentMethod();;
        c.childMethod();
    }
}
