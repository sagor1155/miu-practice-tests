
public class OneTwoThree {
    public static void main(String[] args) {
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1}));       // 0
        System.out.println(is123Arr(new int[]{1,2,3,1,2,3,1,2,3})); // 1
        System.out.println(is123Arr(new int[]{0,1,2,3,1,2,3}));     // 0
        System.out.println(is123Arr(new int[]{1,2,3,3,2,1,1,2,3})); // 0
        System.out.println(is123Arr(new int[]{1,2,3}));             // 1
        System.out.println(is123Arr(new int[]{1,2}));               // 0
        System.out.println(is123Arr(new int[]{}));                  // 0
    }

    public static int is123Arr(int[] nums) {
        if (nums.length<3 || nums[0]!=1 || nums[nums.length-1]!=3 || nums.length%3!=0) {
            return 0;
        }

        for (int i=0; i<nums.length; i+=3) {
            if(!isMatch(copyArray(nums, i, i+3), new int[]{1, 2, 3})) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isMatch(int[] arr, int[] matchingArr) {
        if (arr.length != matchingArr.length) {
            return false;
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != matchingArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] copyArray(int[] arr, int startIdx, int endIdx) {
        if (endIdx > arr.length) {
            return new int[]{};
        }
        int[] newArr = new int[endIdx-startIdx];
        for (int i=startIdx; i<endIdx; i++) {
            newArr[i-startIdx] = arr[i];
        }
        return newArr;
    }
}