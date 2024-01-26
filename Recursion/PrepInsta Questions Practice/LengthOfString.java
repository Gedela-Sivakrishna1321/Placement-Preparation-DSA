public class LengthOfString {
    
    public static int lengthOf(String str) {
        // Base case
        if(str.equals("")) {
            return 0;
        }

        return lengthOf(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        
        System.out.println(lengthOf("Sivakrishna"));
    }
}
