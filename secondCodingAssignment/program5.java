//5.	Can a constructor have a return type? Write code to justify your answer.

//No constructor can't hava return type
class test{
    test(){
        System.out.println("Actual constructor called automatically");
    }
    int test(){
        System.out.print("\nFake constructor explicitily called with a return value of :");
        return 10;
    }
}
public class program5 {
    public static void main(String[] args) {
        test t=new test();
        System.out.print(t.test());
    }
}
