public class Fancy {
    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(10));
        System.out.println(isFancy(12));
    }

    public static int isFancy(int n) {
        int prev = 1, beforePrev =1;
        int cur = 0;

        if (n == 1) {
            return 1;
        }
        if( n <= 0) {
            return 0;
        }
        for(int i = 1; i < n/2; i++) {
            cur = 3*prev + 2*beforePrev;
            if( cur == n) {
                return 1;
            } else {
                beforePrev = prev;
                prev = cur;
            }
        }
        return 0;
    }
}