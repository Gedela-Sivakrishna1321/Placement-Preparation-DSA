public class PrimeNumber {

    public static boolean isPrime(int n, int i) {
        // Base case
        if(n < 2) {
            return false;
        }

        if(i > Math.sqrt(n)) {
            return true;
        }

        // Logic of the function
        if(n % i == 0) {
            return false;
        }

        return isPrime(n, i+1);
    }

    public static void main(String[] args) {

        System.out.println(isPrime(31111, 2));

        // Time Complexity - O(Sqrt(n))
    }
}