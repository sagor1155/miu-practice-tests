public class SumIsPower {
    public static void main(String[] args) {
        System.out.println(sumIsPower(new int[] {8,8,8,8}));
        System.out.println(sumIsPower(new int[] {8,8,8}));
        System.out.println(sumIsPower(new int[] {1}));
        System.out.println(sumIsPower(new int[] {3,5,3,5}));
    }

    public static int sumIsPower(int[] nums) {
        if (nums == null) return 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum == 1) return 1;
        int powerOf2 = 2;
        while(powerOf2 <= sum) {
            if (powerOf2 == sum) return 1;
            powerOf2 *= 2;
        }
        return 0;
    }
}