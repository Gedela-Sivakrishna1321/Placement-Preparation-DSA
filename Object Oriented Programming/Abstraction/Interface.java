package Abstraction;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.grass();
        b.meet();

        /*     Interface- Interface is a blue print of class
         *   
         *      Why Interface ?
         *        1) Used to acheive Total Abstraction
         *        2) Multiple Inheritance
         *      
         *      Properties :- 
         *          1) All the methods in interface are public, abstract and without implementation     
         *          2) Used to acheive Total Abstraction
         *          3) All the variables in interface are final, public, and static
         * 
         */
    }
}

interface ChessPlayer {
    void moves();
}


class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, top, diagonally in all 4 directions");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("up by 1 step at a time");
    }
}

// Multiple Inheritance
interface Herbivore {
    void grass();
}

interface Carnivore {
    void meet();
}

class Bear implements Herbivore, Carnivore {

    @Override
    public void meet() {
        System.out.println("Eats meet ");
    }

    @Override
    public void grass() {
                System.out.println("Eats grass ");

    }
    
}