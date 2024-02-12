package Classroom;

public class FindSubSets {

    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("{ }");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes Choice
        findSubsets(str, ans + str.charAt(i), i+1);
        // No Choice
        findSubsets(str, ans, i+1);
    }

    public static void findSubsetsUsingStringBuilder(String str, StringBuilder ans, int i) {
        // Base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("Empty subset");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes Choice
        findSubsetsUsingStringBuilder(str, ans.append(str.charAt(i)), i+1);
        // No Choice
        ans.deleteCharAt(ans.length()-1);
        findSubsetsUsingStringBuilder(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
        // findSubsetsUsingStringBuilder(str, new StringBuilder(), 0);

        /*  
         *      Approach :- 
         *          1) Every character has two choices, either it can be a part of answer or no
         *          2) We print the answer when index equals string length
         *      
         *      Time Complexity :- O(n * 2^n)
         *         To get 1 subset it has to travel 'n' levels in recursion tree so for 2^n subsets it'll take
         *          n * 2^n time
         *      Space Complexity :- O(n)
         *          No extra memory is used except the call stack  
         */
    }
    
}
