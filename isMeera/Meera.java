public class Meera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7,9,0,10,1}));
        System.out.println(isMeera(new int[]{6,10,8}));
        System.out.println(isMeera(new int[]{7,6,1}));
        System.out.println(isMeera(new int[]{9,10,0}));
        System.out.println(isMeera(new int[]{1,1,0,8,0,9,9,1}));
    }

    static int isMeera(int[] a) {
        boolean hasOne = false;
        boolean hasNine = false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 1) hasOne = true;
            if(a[i] == 9) hasNine = true;
            if (hasOne && hasNine) {
                return 1;
            }
        }
        return 0;
    }
}