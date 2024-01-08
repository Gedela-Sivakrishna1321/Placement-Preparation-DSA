public class HybridInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.breaths();
        human.eats();
        human.myself();
    }
}

class Animal {
    void eats() {
        System.out.println("eats ");
    }

    void breaths() {
        System.out.println("Breaths ");
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flys");
    }
}

class Mammals extends Animal {
    void milkFeeds() {
        System.out.println("Feeds milk to the off spring");
    }
}

class Shark extends Fish {
    void big() {
        System.out.println("I am the king of all fishes ");
    }
}

class Tuna extends Fish {
    void small() {
        System.out.println("I am a small fish");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("Peacock dances ");
    }
}

class Dog extends Mammals {
    void myself() {
        System.out.println("I am a dog");
    }
}

class Cat extends Mammals {
    void myself() {
        System.out.println("I am a cat");
    }
}

class Human extends Mammals {
    void myself() {
        System.out.println("I'm human being, I can decide how i can be");
    }
}
