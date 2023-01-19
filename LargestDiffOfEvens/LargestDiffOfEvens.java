public class LargestDiffOfEvens {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{-2, 3, 4, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int maxDiff = -1;
        for (int i=0; i<a.length; i++) {
            if (a[i]%2==0) {
                for (int k=0; k<a.length; k++) {
                    if (i!=k && a[k]%2==0) {
                        int diff = a[i] - a[k];
                        if (diff > maxDiff) {
                            maxDiff = diff;
                        }
                    }
                }
            }
       }
       return maxDiff;
    }
}