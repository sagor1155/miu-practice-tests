import java.util.Arrays;
public class CommonElm {
    public static void main(String[] args) {
        printArr(commonElem(new int[]{1,2,3}, new int[]{2,3}));
        printArr(commonElem(new int[]{1,8,3,2}, new int[]{4,2,6,1}));
    }

    public static int[] commonElem(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }
        int min = first.length < second.length ? first.length : second.length;
        int[] smaller, larger;
        if (min == first.length) {
            smaller = first;
            larger = second;
        } else {
            smaller = second;
            larger = first;
        }
        int[] minArr = new int[min];
        int k = 0;
        for(int i = 0; i < smaller.length ; i++) {
            for(int j = 0; j < larger.length; j++) {
                if (smaller[i] == larger[j]) {
                    minArr[k] = smaller[i];
                    k++;
                }
            }
        }
        int[] common = new int[k];
        for(int i = 0; i < common.length; i++) {
            common[i] = minArr[i];
        }
        return common;
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("##########");
    }
}