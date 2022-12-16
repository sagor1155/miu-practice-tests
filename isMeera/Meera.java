public class Meera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7,9,0,10,1}));
        System.out.println(isMeera(new int[]{6,10,8}));
        System.out.println(isMeera(new int[]{7,6,1}));
        System.out.println(isMeera(new int[]{9,10,0}));
        System.out.println(isMeera(new int[]{1,1,0,8,0,9,9,1}));
    }

    static int isMeera(int[] a) {
        boolean foundOne = false, foundNine = false;
        for(int v : a) {
            if(v == 1) {
                foundOne = true;
            } else if (v == 9) {
                foundNine = true;
            }
        }
        return foundOne && foundNine ? 1 : 0;
    }
}