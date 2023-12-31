package Assignment;
import java.util.Scanner;

public class LowercaseCount {
    
    public static int lowercaseCount(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Lowercase count - " + lowercaseCount(str));
        String str2 ="ApnaCollege".replace("l","");
        System.out.println(str2);
    }
}
