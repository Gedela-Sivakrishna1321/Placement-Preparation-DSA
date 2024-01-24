
public class PowerOfNumber {

    public static int calcPower(int base, int power) {
        // Base case
        if(power == 1) {
            return base;
        }

        // Recursive call
        return base * calcPower(base, power-1);

    }

    public static void main(String[] args) {
        
        System.out.println(calcPower(10, 3));
    }
    
}
