package Abstraction;

public class AbstractClass {

    public static void main(String[] args) {
      
        BabyHorse b = new BabyHorse();

        /*        Abstraction :- Hiding the unnecessary details & showing only the important parts to the user
         *      1) Abstract classes cannot be instantiated
         *      2) Can have both abstract / non-abstract methods
         *      3) Can have constructer
         * 
         */
    }
    
}

abstract class Animal {
    String color ;

    Animal() {
        System.out.println("Animal constructer is called ");
    }

    void eats() {
        System.out.println("Animal eats");
    }

    abstract void walks();

}

class Horse extends Animal {
    
    Horse() {
        System.out.println("Horse constructer is called");
    }

    void walks() {
        System.out.println("Walks on 4 legs");
    }
}

class BabyHorse extends Horse {
    BabyHorse() {
        System.out.println("BabyHorse constructer is called");
    }
}

class Chicken extends Animal {
    void walks() {
        System.out.println("Walks on 2 legs");
    }
}
