public class RapidIncrease {
    public static void main(String[] args) {
        System.out.println(isRapidlyIncreasing(new int[]{1,3,9,27}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,200,500}));
        System.out.println(isRapidlyIncreasing(new int[]{1}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,9,26}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,7,26}));
        System.out.println(isRapidlyIncreasing(new int[]{1,3,8,26}));
    }

    public static int isRapidlyIncreasing(int[] nums) {
        if (nums.length == 1) return 1;
        for(int i = 1; i < nums.length; i++) {
            int sum = 0, j = i - 1;
            while(j >= 0) {
                sum += nums[j];
                j--;
            }
            if (nums[i] <= 2 * sum) {
                return 0;
            }
        }
        return 1;
    }
}