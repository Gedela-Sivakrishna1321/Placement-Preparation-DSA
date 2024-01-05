public class SwapTwoNumbers {

    public static void main(String[] args) {
        // ------------------------------ SWAP TWO NUMBERS WITHOUT THIRD VARIABLE ---------------------------
        int a = 242, b = 243;
        System.out.println("Before Swapping - " + a +", "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping - " + a +", "+b);

        // Xor of Same Number gives 0 because xor of same bits results in zero
        System.out.println(242 ^ 242);
        
        // Add 1 to an Integer 
        System.out.println(-~16);

        // Convert Uppercase to Lowercase
        System.out.println((char)('A' | ' ')); 

        // ASCII value of ' ', single space character is - 32
    }
}
