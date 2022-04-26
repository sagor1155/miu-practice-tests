public class BunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunker(new int[] {7, 6, 10, 1}));
        System.out.println(isBunker(new int[] {7, 6, 10}));
        System.out.println(isBunker(new int[] {6, 10, 1}));
        System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));
    }

    public static int isBunker(int[] a) {
        boolean hasOne = false;
        boolean hasPrime = false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) hasOne = true;
            if(isPrime(a[i])) hasPrime = true;
            if(hasOne && hasPrime) return 1;
        }
        return 0;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}