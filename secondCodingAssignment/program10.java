//10.	Write a Java program showing method inheritance.
/*
Method inheritance is a feature of java in which a child class can use the accessible methods
of its parent calss without defining those methods again.
*/
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

public class program10 {
    public static void main(String[] args) {
    Dog d=new Dog();
    d.eat();
    d.bark();
}
}
