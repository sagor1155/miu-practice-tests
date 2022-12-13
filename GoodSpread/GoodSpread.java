public class GoodSpread {
    public static void main(String[] args) {
        System.out.println(isGoodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(isGoodSpread(new int[] {3, 1, 3 ,1, 3, 5, 5, 3}));
    }

    public static int isGoodSpread(int[] a) {
        for (int i=0; i<a.length; i++) {
            int count = 1;
            for (int j=i+1; j<a.length; j++) {
                if (a[i]==a[j]) {
                    count++;
                }
            }
            if (count > 3) {
                return 0;
            }
        }
        return 1;
    }
}