public class ClearIthBit {

    public static int clearIthBit(int num, int i) {
        // BitMask
        int bitMask = ~(1 << i);
        
        return num & bitMask;
    }

    public static int updateIthBit(int num, int i, int bit) {

        num = clearIthBit(num, i);
        int BitMask = bit << i;
        return num | BitMask;
    }

    public static void main(String[] args) {
        // System.out.println(clearIthBit(10, 3)); // o/p -> 2
        System.out.println(updateIthBit(10, 0, 1));
    }
    
}
