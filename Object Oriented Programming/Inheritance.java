public class Inheritance {
    public static void main(String[] args) {
        // Humans siva = new Humans();
        // siva.eats();
        // siva.think();
        // siva.unformed();
        // Dog jonny = new Dog();
        // jonny.eats();
        // jonny.breaths();
        // jonny.legs = 4;
        // System.out.println(jonny.legs);

        // Heirarchial Inheritance
        Fish fish = new Fish();
        Bird bird = new Bird();
        Cow cow = new Cow();
        fish.eats();
        fish.swim();
        bird.eats();
        bird.fly();
        cow.eats();
        cow.walks();
    }
}

class LivingBeing {

    void breaths() {
        System.out.println("Breaths ..");
    }

    void see() {
        System.out.println("Can see the world ..");
    }

    void eats() {
        System.out.println("Eats ..");
    }

    void dies() {
        System.out.println("Living Being Dies ..");
    }

}
// Single - Level Inheritance
class Humans extends LivingBeing { // We use extends keyword to get the properties & methods of parent class

    void memory() {
        System.out.println("Has memory, can remember things ..");
    }

    void imagine() {
        System.out.println("Can imagine things");
    }

    void think() {
        System.out.println("Can think ..");
    }

    void unformed() {
        System.out.println("Human beings come unformed,, Until they are alive, everything is possibility ..");
    }
}

// Multi - Level Inheritance
class Animal {
    int skinColor;

    void eats() {
        System.out.println("eats ..");
    }

    void breaths() {
        System.out.println("Breaths ..");
    }

}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    int breed;
}

// Heirarchial Inheritance
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Cow extends Animal {
    void walks() {
        System.out.println("Walks ");
    }
}