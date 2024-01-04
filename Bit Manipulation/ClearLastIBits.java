public class ClearLastIBits {

    // Clear All Last I Bits
    public static int clearIBits(int num, int i) {
        int BitMask = (~0) << i;
        return BitMask & num;
    }


    public static int clearFirstIBits(int num, int i) {
        int BitMask = (~0) >> i;
        return num & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        System.out.println(clearFirstIBits(15, 2));
    }
}