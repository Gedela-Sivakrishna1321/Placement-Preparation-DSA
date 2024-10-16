public class PrintAllPermutation {

    public static void printPermutaion(String str, String op) {
        // Base case
        if(str.length() == 0) {
            System.out.println(op);
            return;
        }

        // Logic
        for(int i=0; i<str.length(); i++) {
            printPermutaion(str.substring(0,i) + str.substring(i+1), op+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        printPermutaion("sivakrishna", "");
    }
}