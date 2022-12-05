public class OneTwoOne {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1}));         // 1
        System.out.println(is121Array(new int[]{1,1,2,2,2,1}));           // 0
        System.out.println(is121Array(new int[]{2,2,1,1,2,2,1,1}));       // 0
        System.out.println(is121Array(new int[]{1,1,1,2,1,1,1}));         // 1
        System.out.println(is121Array(new int[]{1,1,1,0,1,1,1}));         // 0
        System.out.println(is121Array(new int[]{1,1,2,2,1,1,2,2,1,1}));   // 0
    }

    public static int is121Array(int[] nums) {
        if (nums.length<3 && nums[0]!=1 && nums[nums.length-1]!=1) {
            return 0;
        }

        int startOnes=0, endOnes=0, midTwos=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=1 && nums[i]!=2) {
                return 0;
            }

            if (nums[i]==1) {
                if (startOnes==0 && midTwos>0) {
                    return 0;
                }
                if (endOnes==0 && midTwos==0) {
                    startOnes++;
                }
                if (startOnes>0 && midTwos>0) {
                    endOnes++;
                }
            } else if (nums[i]==2) {
                if (startOnes==0 || endOnes>0) {
                    return 0;
                }
                if (startOnes>0 && endOnes==0) {
                    midTwos++;
                }
            }
        }
        return (startOnes==endOnes && midTwos>0) ? 1 : 0;
    }
}