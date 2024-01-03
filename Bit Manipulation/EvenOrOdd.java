public class EvenOrOdd {
    
    public static void evenOrOdd(int num) {

        int bitMask = 1; // Here '1' is said to be bitMask

        // Even condition
        if((num & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(242);
        evenOrOdd(243);
        evenOrOdd(1);
    }
}
