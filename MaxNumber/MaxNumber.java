public class MaxNumber {
    public static void main(String[] args) {
        System.out.println(maxNumber(new int[] { 1, 2, 3, 5}));
        System.out.println(maxNumber(new int[] { 7, 2, 3, 5}));
        System.out.println(maxNumber(new int[] { 1, 2, 43, 0}));
    }

    public static int maxNumber(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}