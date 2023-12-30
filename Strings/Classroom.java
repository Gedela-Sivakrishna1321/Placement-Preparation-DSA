public class Classroom {

    public static void main(String[] args) {
        
    //     String str[] = {"Apple", "banana", "mango","Mango"};

    //     String largest = str[0];

    //     for(int i=1; i<str.length; i++) {
    //         if(largest.compareToIgnoreCase(str[i]) < 0) {
    //             largest = str[i];
    //         }
    //     }

    //     System.out.println("Largest fruit - " + largest);
    // }

    /*       Time Complexity - O(n*x), compareTo function takes (x) time, where x is length of largest string
     *        Totally, we are comparing n strings.
     * 
     */

     StringBuilder sb = new StringBuilder();

     for(char ch = 'a'; ch <= 'z'; ch++) {
        sb.append(ch);
     }

     System.out.println(sb);
    
}

}
