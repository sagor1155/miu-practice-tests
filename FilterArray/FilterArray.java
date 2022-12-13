public class FilterArray {

    public static void main(String[] args) {
        System.out.println(isFilter(new int[] {1, 2, 3, 9, 6, 11})); // 1
        System.out.println(isFilter(new int[] {3, 4, 6, 7, 14, 16})); // 1
        System.out.println(isFilter(new int[] {1, 2, 3, 4, 10, 11, 13})); // 1
        System.out.println(isFilter(new int[] {3, 6, 5, 5, 13, 6, 13})); // 1
        System.out.println(isFilter(new int[] {9, 6, 18})); // 0
        System.out.println(isFilter(new int[] {4, 7, 13})); // 0
    }

    static int isFilter(int[] a) {
        boolean isNineExists = false;
        boolean isElevenExists = false;
        boolean isSevenExists = false;
        boolean isThirteenExists = false;
        boolean firstCondition = true;
        boolean secondCondition = true;

        for (int i=0; i<a.length; i++) {
            switch (a[i]) {
                case 9:
                    isNineExists = true;
                    break;
                case 11:
                    isElevenExists = true;
                    break;
                case 7:
                    isSevenExists = true;
                    break;
                case 13:
                    isThirteenExists = true;
                    break;
                default:
                    break;
            }
        }

        if (isNineExists && !isElevenExists) {
            firstCondition = false;
        }
        if (isSevenExists && isThirteenExists) {
            secondCondition = false;
        }

        return (firstCondition && secondCondition) ? 1 : 0;
    }
}