package PolyMorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.myself();
        d.myself();
    }
}
// Parent & child class both have same function but different defination

class Animal {
    void myself() {
        System.out.println("I am animal ");
    }
}

class Dog extends Animal {
    void myself() {
        System.out.println("I am dog ");
    }
}
