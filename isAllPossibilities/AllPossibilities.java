import java.util.Arrays;

public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {1,2,0,3}));
        System.out.println(isAllPossibilities(new int[] {3,2,1,0}));
        System.out.println(isAllPossibilities(new int[] {1,2,4,3}));
        System.out.println(isAllPossibilities(new int[] {0,2,3}));
        System.out.println(isAllPossibilities(new int[] {0}));
        System.out.println(isAllPossibilities(new int[] {}));
    }

//    public static int isAllPossibilities(int[] nums) {
//        if(nums.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//        for(int i = 1; i < nums.length; i++) {
//            if(i != nums[i]){
//                return 0;
//            }
//        }
//        return nums[0] == 0? 1: 0;
//    }

    public static int isAllPossibilities(int[] nums) {
        if( nums.length == 0) {
            return 0;
        }

        for(int i = 0; i < nums.length; i++) {
            boolean hasNum = false;
            for(int j = 0; j < nums.length; j++) {

                if(i == nums[j]) {
                    hasNum = true;
                    break;
                }
            }
            if(!hasNum) {
                return 0;
            }
        }
        return  1;
    }
}
