public class MeeraArray {
    public static void main(String[] args) {
        System.out.println(isMeeraArr(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));
        System.out.println(isMeeraArr(new int[] {2, 4, 6, 8, 6}));
        System.out.println(isMeeraArr(new int[] {2, 8, 7, 10, -4, 6}));

    }

    public static int isMeeraArr(int[] a) {
        int firstEvenCount = 0;
        int lastEvenCount = 0;
        boolean hasOdd = false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                hasOdd = true;
                break;
            } 
        }
        if(!hasOdd) return 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                firstEvenCount++;
            } else {
                break;
            }
        }
        for(int j = a.length - 1; j >= 0; j--) {
            if(a[j] % 2 == 0) {
                lastEvenCount++;
            } else {
                break;
            }
        }
        
        return (lastEvenCount == firstEvenCount) && hasOdd ? 1 : 0;
    }
}