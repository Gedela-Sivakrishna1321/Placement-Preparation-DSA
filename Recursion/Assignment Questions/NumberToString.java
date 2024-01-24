 
public class NumberToString {

    static String[] digits = {"zero","0ne", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int num) {
        // Base Case
        if(num == 0) {
            return;
        }


        //Logic 
        int lastDigit = num % 10;
        printDigits(num/10);
        System.out.print(digits[lastDigit ] + " " );
    }

    public static void main(String[] args) {
        printDigits(2003);
        printDigits(1947);
    }
}