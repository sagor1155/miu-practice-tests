public class GuthrieSequence {

    public static void main(String[] args) {
        System.out.println(isGuthrie(new int[]{8,4,2,1}));
        System.out.println(isGuthrie(new int[]{8,17,4,1}));
        System.out.println(isGuthrie(new int[]{8,4,1}));
        System.out.println(isGuthrie(new int[]{8,4,2}));
        System.out.println(isGuthrie(new int[]{16,8,4,2,1}));
    }

    static int isGuthrie(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int n = a[0];
        int idx = 0;
        while (n != 1) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            idx++;
            if (idx >= a.length || a[idx]!=n) {
                return 0;
            }
        }
        return 1;
    }
}