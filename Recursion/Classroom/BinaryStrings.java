public class BinaryStrings {

    // Binary Strings without consecutive ones
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        // Base case
        if( n == 0) {
            System.out.println(str);
            return;
        }

        // Logic of the function
        printBinaryStrings(n-1, 0, str + "0");
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 1, str + "1");
        }
    }

    // Binary Strings without consecutive zeros
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        // Logic of the function
        printBinStrings(n-1, 1, str + "1");
        if(lastPlace == 1 ) {
            printBinStrings(n-1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}