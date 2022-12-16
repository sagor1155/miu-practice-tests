public class GuthrieSequence {

    public static void main(String[] args) {
        System.out.println(isGuthrie(new int[]{8,4,2,1}));
        System.out.println(isGuthrie(new int[]{8,17,4,1}));
        System.out.println(isGuthrie(new int[]{8,4,1}));
        System.out.println(isGuthrie(new int[]{8,4,2}));
    }

    static int isGuthrie(int[] a) {
        if(a[a.length-1] != 1) {
            return 0;
        }

        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] % 2 == 0) {
                if(a[i+1] != a[i] / 2) return 0;
            } else {
                if(a[i+1] != 3 * a[i] + 1) return 0;
            }
        }
        return 0;
    }
}