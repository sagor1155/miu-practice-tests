public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {1,2,0,3}));
        System.out.println(isAllPossibilities(new int[] {3,2,1,0}));
        System.out.println(isAllPossibilities(new int[] {1,2,4,3}));
        System.out.println(isAllPossibilities(new int[] {0,2,3}));
        System.out.println(isAllPossibilities(new int[] {0}));
        System.out.println(isAllPossibilities(new int[] {}));
    }

    public static int isAllPossibilities(int[] nums) {
        if (nums.length == 0) return 0;
        for(int i = 0; i < nums.length; i++) {
            boolean hasItem = false;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    hasItem = true;
                    break;
                }
            }
            if (!hasItem) return 0;
        }
        return 1;
    }
}
