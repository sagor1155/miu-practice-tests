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
        int len = nums.length;

        if(len == 0) {
            return 0;
        }
        if(len % 2 == 0) {
            return 0;
        }

        int mid = (len/2);
        int centerValue = nums[mid];

        for(int i = 0; i < len ; i++) {
            if(i == mid){
                continue;
            }
            if(centerValue >= nums[i]) {
                return 0;
            }
        }
        return 1;
    }
}