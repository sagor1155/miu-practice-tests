public class MeeraArray {
    public static void main(String[] args) {
        System.out.println(isMeeraArr(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6})); // 1
        System.out.println(isMeeraArr(new int[] {2, 4, 6, 8, 6})); // 0
        System.out.println(isMeeraArr(new int[] {2, 8, 7, 10, -4, 6})); // 0

    }

    public static int isMeeraArr(int[] a) {
        int startEvenCount = 0;
        int endEvenCount = 0;
        boolean hasOdd = false;

        for (int i=0; i<a.length; i++) {
            if (a[i]%2==0) {
                if (hasOdd) {
                    endEvenCount++;
                } else {
                    startEvenCount++;
                }
            } else {
                hasOdd = true;
                endEvenCount = 0;
            }            
        }
        return (startEvenCount==endEvenCount && hasOdd) ? 1 : 0;
    }
}