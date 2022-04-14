public class Center {
    public static void main (String[] args) {
        System.out.println(isCentered(new int[] {1,2,3,4,5}));
        System.out.println(isCentered(new int[] {3,2,1,4,5}));
        System.out.println(isCentered(new int[] {3,2,1,4,1}));
        System.out.println(isCentered(new int[] {1,2,3,4}));
        System.out.println(isCentered(new int[] {}));
        System.out.println(isCentered(new int[] {10}));
    }

    public static int isCentered(int[] nums) {
        if (nums.length == 0 || nums.length % 2 == 0) {
            return 0;
        }
        int middleIndex = nums.length / 2;
        for(int i = 0; i < nums.length; i++) {
            if (i != middleIndex && nums[middleIndex] >= nums[i]) { //early exit
                return 0;
            }
        }
        return 1;
    }
}