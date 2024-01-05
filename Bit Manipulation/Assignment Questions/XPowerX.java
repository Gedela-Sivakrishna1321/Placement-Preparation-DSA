public class XPowerX {

    public static long powerOf(long num) {
        long ans = 1;
        long temp = num;

        System.out.println(System.currentTimeMillis());
        while(temp > 0) {
            if((temp & 1) != 0 ) {
                ans = ans * num;
            }
            // Update num
            num = num * num;
            // Right Shift Temp by 1 Bit
            temp = temp >> 1;
        }
         System.out.println(System.currentTimeMillis());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(powerOf(8));
    }
}