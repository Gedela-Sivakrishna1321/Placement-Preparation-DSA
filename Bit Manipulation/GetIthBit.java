public class GetIthBit {
    
    public static int getIthBit(int num, int i) {
        
        int bitMask = 1 << i;

        if((num & bitMask) == 0) {
            return 0;
        } 
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(242, 1));
    }
}
