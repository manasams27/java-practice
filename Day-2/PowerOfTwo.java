public class PowerOfTwo {

    static boolean isPowerOfTwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); 
        System.out.println(isPowerOfTwo(14)); 
        System.out.println(isPowerOfTwo(1));  
        System.out.println(isPowerOfTwo(0));  
    }
}