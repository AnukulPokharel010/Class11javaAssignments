//3.	Create a class Student with a constructor that initializes id and name, then display the details. 
class Student{
    int id;
    String name;

    Student(int i, String n) {
        id=i;
        name=n;
    }
    void displayDetails(){
        System.out.println("Details: \n "+"id= "+id+"\n name= "+name);
    }
}
public class program2 {
    public static void main(String[] args) {
        Student stu= new Student(5,"Ramesh");
        stu.displayDetails();
    }
}
