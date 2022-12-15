public class Bean {
    public static void main(String[] args) {
        System.out.println(isBean(new int[]{4,9,8}));
        System.out.println(isBean(new int[]{2,2,5,11,23}));
        System.out.println(isBean(new int[]{7,7,3,6}));
        System.out.println(isBean(new int[]{0}));
        System.out.println(isBean(new int[]{3,8,4}));
    }

    public static int isBean(int[] a) {
        if (a.length==0) return 0;
        for (int i=0; i<a.length; i++) {
            int n = a[i];
            boolean flag = false;
            for (int j=0; j<a.length; j++) {
                if ((a[j]==2*n || a[j]==2*n+1 || a[j]==n/2)) {
                    flag = true;
                }
            }
            if (!flag) return 0;
        }
        return 1;
    }
}