//9.	Can a child class access private members of a parent class? Write a program to explain.
//no it can't if it tries it will throw an error

class parent{
    private void privateMethod(){
        System.out.println("child can't access me, he he he!!!");
    }
    public void publicMethod(){
        System.out.println("Child can access me");
    }
}

public class program9 extends parent{
    public static void main(String[] args) {
        
       parent p=new parent();
    p.privateMethod();  //compilation error
    p.publicMethod();
 
    }
    
}
