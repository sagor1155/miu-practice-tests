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
        for(int i = 0; i < nums.length; i++) {
            int lessSum = 0;
            for(int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    lessSum += nums[j];
                }
            }
            if (nums[i] < lessSum) {
                return 0;
            }
        }
        return 1;
    }
}