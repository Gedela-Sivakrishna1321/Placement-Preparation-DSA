public class PrintNthFib {

    public static int printFib(int n) {
        // Base case
        if(n == 0 || n == 1) {
            return n;
        }
        return printFib(n-1) + printFib(n-2);
    }

    public static int seriesSum(int num) {
        int var = 1, prod = 0;

        for(int i=1; i<=num; i++) {
            int curr = 1;
            for(int j=1; j<=i; j++) {
                curr *= var;
                var++;
            }
            prod += curr;
        }
        return prod;
    }

    public static void main(String[] args) {
        // System.out.println(printFib(3));
        /*  
         *      Fibonaaci series :- 0, 1, 1, 2, 3, 5, 8, 13, ......etc
         *      Here, every number is a sum of previous two terms.
         *      
         *      Note :- The first two terms i.e 0th & 1st term of fibonaaci series is fixed. 
         */
        System.out.println(seriesSum(4));
    }
}