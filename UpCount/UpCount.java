public class UpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(nUpCount(new int[]{6, 3, 1}, 6));
    }

    public static int upCount(int[] a, int n) {
        int prevPartialSum = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            int sum = prevPartialSum + a[i];
            if (prevPartialSum <= n && sum > n) {
                count++;
            }
            prevPartialSum = sum;
        }
        return count;
    }
}