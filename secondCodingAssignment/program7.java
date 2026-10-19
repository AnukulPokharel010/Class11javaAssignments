//7.	Create a parent class Animal and child class Dog. Add methods and show inheritance.
class Animal{
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog barks");
    }
}

public class program7 {
    public static void main(String[] args) {
    Dog d=new Dog();
    d.eat();
    d.bark();
}
}
