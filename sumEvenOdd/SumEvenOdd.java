public class SumEvenOdd {
    public static void main (String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{3,3,4,4}));
        System.out.println(f(new int[]{}));
    }

    public static int f(int[] a) {
        int X = 0, Y = 0;

        for (int value : a) {
            if (value % 2 == 0) {
                Y += value;
            } else {
                X +=  value;
            }
        }

        return X-Y;
    }
}