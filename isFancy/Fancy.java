public class Fancy {
    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(10));
        System.out.println(isFancy(12));
    }

    public static int isFancy(int n) {
        int prev = 1;
        int beforePrev = 1;
        int current = 0;
        if (n == 1) return 1;
        if (n <=0 ) return 0;

        for(int i = 0; i < n / 2; i++) {
            current = prev * 3 + beforePrev * 2;
            if (current == n) {
                return 1;
            } else {
                beforePrev = prev;
                prev = current;
            }
        }
        return 0;
    }
}