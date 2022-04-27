public class FilterArray {

    public static void main(String[] args) {
        System.out.println(isFilter(new int[] {1, 2, 3, 9, 6, 11}));
        System.out.println(isFilter(new int[] {3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[] {1, 2, 3, 4, 10, 11, 13}));
        System.out.println(isFilter(new int[] {3, 6, 5, 5, 13, 6, 13}));
        System.out.println(isFilter(new int[] {9, 6, 18}));
        System.out.println(isFilter(new int[] {4, 7, 13}));
    }

    static int isFilter(int[] a) {
        boolean cond1 = true;
        boolean cond2 = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 11) {
                        cond1 = true;
                        break;
                    } else cond1 = false;
                }
            }

            if (a[i] == 7) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == 13) {
                        cond2 = false;
                        break;
                    } else cond2 = true;
                }
            }
        }

        return cond1 && cond2 ? 1 : 0;
    }
}