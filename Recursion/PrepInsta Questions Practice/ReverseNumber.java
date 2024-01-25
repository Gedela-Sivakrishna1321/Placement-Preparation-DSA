public class ReverseNumber {

    public static int reverseNumber(int num, int rev) {
        // Base case
        if(num == 0) {
            return rev;
        }

        // Logic 
        rev = rev * 10 + num%10;

        return reverseNumber(num/10, rev);
    }

    public static void printReverse(long num) {
        // Base case
        if(num < 10) {
            System.out.println(num);
            return;
        }
        // Logic
        System.out.print(num%10);
        // Recursive call
        printReverse(num/10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(2345, 0));
        printReverse(2101011202);
        // Time Complexity - O(d) where d is the number of digits in the number
    }
}
