//8.	Write a program where a child class accesses public members of a parent class.
class parent{   //parent class

    public int parentAttribute=100;

    public void parentMethod(){

        System.out.println("Parent public method");

    }
}

public class program8 extends parent{     //child class
    public static void main(String[] args) {
         parent p=new parent();
    p.parentMethod();   //child accessed parent method
    System.out.println("Attirbute value from parent= "+p.parentAttribute); //child accessed parent attribute
    }
   
}
