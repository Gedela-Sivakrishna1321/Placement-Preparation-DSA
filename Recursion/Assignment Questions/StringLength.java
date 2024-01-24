public class StringLength {
    
    public static void calcStringLength(String str, int len, int i) {
        // Base case
        if(i == str.length()) {
            System.out.println(len);
            return;
        }
        // Logic
        len++;
        // Recursive call
        calcStringLength(str, len, i+1);
    }

    public static void main(String[] args) {
        calcStringLength("20045", 0, 0);
    }
}
