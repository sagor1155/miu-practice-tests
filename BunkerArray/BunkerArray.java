public class BunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunker(new int[] {7, 6, 10, 1}));  // 1
        System.out.println(isBunker(new int[] {7, 6, 10}));     // 0
        System.out.println(isBunker(new int[] {6, 10, 1}));     // 0
        System.out.println(isBunker(new int[] {3, 7, 1, 8, 1}));// 1    
    }

    public static int isBunker(int[] a) {
        boolean isPrimeNumber = false;
        boolean isOnePresent = false;
        for (int i=0; i<a.length; i++) {
            isPrimeNumber = (isPrime(a[i])==1) ? true : isPrimeNumber;
            isOnePresent = (a[i]==1) ? true : isOnePresent;
        }
        return (isPrimeNumber && isOnePresent) ? 1 : 0;
    }

    private static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i=2; i <= n/2; i++) {
            if (n%i==0) {
                return 0;
            }
        }
        return 1;
    }
}