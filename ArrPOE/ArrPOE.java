public class ArrPOE {
    public static void main(String[] args) {
        System.out.println(poeIndex(new int[]{1,8,3,7,10,2}));
        System.out.println(poeIndex(new int[]{1,5,3,1,1,1,1,1,1}));
        System.out.println(poeIndex(new int[]{2,1,1,1,2,1,7}));
        System.out.println(poeIndex(new int[]{1,2,3}));
        System.out.println(poeIndex(new int[]{3,4,5,10}));
        System.out.println(poeIndex(new int[]{1,2,10,3,4}));
    }

    public static int poeIndex(int[] nums) {
        if (nums.length < 3) return -1;
        int i = 0, j = nums.length - 1;
        int idx = 1;
        int leftSum = nums[i];
        int rightSum = nums[j];
        for(int k = 1; k < nums.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += nums[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += nums[j];
                idx = j - 1;
            }
            
        }
        return leftSum == rightSum ? idx : -1;
    }
}