public class OneTwoThree {
    public static void main(String[] args) {
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1}));
        System.out.println(is123Arr(new int[]{0,1,2,3,1,2,3}));
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1,1,2,3}));
        System.out.println(is123Arr(new int[]{1,2,3}));
        System.out.println(is123Arr(new int[]{}));
    }

    public static int is123Arr(int[] nums) {
        if (nums.length == 0 || nums.length % 3 != 0) {
            return 0;
        }
        for(int i = 0; i < nums.length; i += 3) {
            if(nums[i] != 1 || nums[i+1] != 2 || nums[i+2] != 3) {
                return 0;
            }
        }
        return 1;
    }
}