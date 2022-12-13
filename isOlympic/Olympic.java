public class Olympic {
    public static void main(String[] args) {
        System.out.println(isOlympic(new int[]{3, 2, 1}));
        System.out.println(isOlympic(new int[]{2, 2, 1, 1}));
        System.out.println(isOlympic(new int[]{1, 1000, 100, 10000, 2}));
        System.out.println(isOlympic(new int[]{1, 99, 99, 1000, 100, 10000, 2}));
        System.out.println(isOlympic(new int[]{1, 2, 1, 3, 2}));
        System.out.println(isOlympic(new int[]{1, 2, -1, 2, 2}));
    }

    public static int isOlympic(int[] nums) {

        int min = Integer.MAX_VALUE;
        for (int item : nums) {
            int sumUpToItem = ((item + 1) * item) / 2 - item;
            min = Math.min(min, item);

            if (sumUpToItem > item) {
                return 0;
            }
        }
        return min == 1 ? 1: 0;
    }
}