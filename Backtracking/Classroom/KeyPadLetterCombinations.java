package Classroom;

public class KeyPadLetterCombinations {

    static char[][] L = {{}, {}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'},
                                   {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'},
                                       {'t','u','v'}, {'w','x','y','z'}};

    
    public static void letterCombinations(String Digit) {

        int len = Digit.length();

        if(len == 0) {
            System.out.println("");
            return;
        }

        bfs(0, len, new StringBuilder(), Digit);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String digit) {
        // Base case
        if(pos == len) {
            System.out.println(sb.toString());
            return;
        }

        else {

            char[] letters = L[Character.getNumericValue(digit.charAt(pos))];

            for(int i=0; i<letters.length; i++) {
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), digit);
            }
        }
    }

    public static void main(String[] args) {
        // letterCombinations("235");
        letterCombinations("23");
        // letterCombinations("242");
    }
    
}
