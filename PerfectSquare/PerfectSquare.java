public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }

    public static int nextPerfectSquare(int n) {
        if (n < 0) return 0;
        double sqrt = Math.sqrt(n);
        int nextInt = (int) sqrt + 1;
        return nextInt * nextInt;
    }
}