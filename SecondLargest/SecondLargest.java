public class SecondLargest {

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] { 1, 2, 3, 4 }));
        System.out.println(secondLargest(new int[] { 4, 1, 2, 3 }));
        System.out.println(secondLargest(new int[] { 1, 1, 2, 2 }));
        System.out.println(secondLargest(new int[] { 1, 1 }));
        System.out.println(secondLargest(new int[] { 1 }));
        System.out.println(secondLargest(new int[] {}));
    }

    static int secondLargest(int[] a) {
        int smax = -1;
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                smax = max;
                max = a[i];
            }
            if (a[i] > smax && a[i] < max)
                smax = a[i];
        }
        return smax;
    }

}