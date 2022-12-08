
public class ArrPOE {
    public static void main(String[] args) {
        System.out.println(poeIndex(new int[]{1,8,3,7,10,2}));      // 3
        System.out.println(poeIndex(new int[]{1,5,3,1,1,1,1,1,1})); // 2
        System.out.println(poeIndex(new int[]{2,1,1,1,2,1,7})); // 5
        System.out.println(poeIndex(new int[]{1,2,3}));         // -1
        System.out.println(poeIndex(new int[]{3,4,5,10}));      // -1
        System.out.println(poeIndex(new int[]{1,2,10,3,4}));    // -1
    }

    public static int poeIndex(int[] nums) {
        if (nums.length<3) {
            return -1;
        }

        for (int i=1; i<nums.length-1; i++) {
            int leftSum = getSum(copyArray(nums, 0, i));
            int rightSum = getSum(copyArray(nums, i+1, nums.length));
            if (leftSum==rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
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