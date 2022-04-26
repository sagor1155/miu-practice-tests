public class SuperArr {
    public static void main(String[] args) {
        System.out.println(isSuper(new int[]{2, 3, 6, 13}));
        System.out.println(isSuper(new int[]{2, 3, 5, 11}));
    }

    public static int isSuper(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += a[j];
            }
            if(sum >= a[i]) return 0;
        }
        return 1;
    }
}