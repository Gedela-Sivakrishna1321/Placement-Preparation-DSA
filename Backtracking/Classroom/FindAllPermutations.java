package Classroom;

public class FindAllPermutations {

    public static void findAllPermutation(String str, String ans) {
        // Base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            findAllPermutation(newString, ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findAllPermutation(str, "");
    }
}
