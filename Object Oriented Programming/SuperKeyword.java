public class SuperKeyword {
    
    public static void main(String[] args) {
        // Lion l = new Lion();
        // System.out.println(l.color);
        club c = new club();
        System.out.println(c.color);
    }
}

class Animal {
    String color ;
    Animal() {
        System.out.println("Animal class's constructor !");
    }
}

class Lion extends Animal {
    Lion() {
        System.out.println("Lion class constructor");
        // super.color = "Light Yellow";

    }
}

class club extends Lion {
    club() {
        System.out.println("Club constructor is called !");
        super.color = "red";
    }
}