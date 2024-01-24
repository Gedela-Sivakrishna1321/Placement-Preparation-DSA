public class TowerOfHanoi {

    public static void transferDisks(int n, String src, String helper, String dest) {

        // Base case
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest );
            return;
        }

        transferDisks(n-1, src, dest, helper);
        System.out.println("transfer disk " + n+ " from " + src + " to " + dest);
        transferDisks(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        
        transferDisks(3, "S", "H", "D");
        
    }
}