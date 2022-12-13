
public class CommonElm {
    public static void main(String[] args) {
        printArr(commonElem(new int[]{1,8,3,2}, new int[]{4,2,6,1})); // {1,2}
        printArr(commonElem(new int[]{1,8,3,2,6}, new int[]{2,6,1})); // {2,6,1}
        printArr(commonElem(new int[]{1,3,7,9}, new int[]{7,1,9,3})); // {1,3,7,9}
        printArr(commonElem(new int[]{1,2}, new int[]{3,4}));   // {}
        printArr(commonElem(new int[]{}, new int[]{1,2,3}));    // {} 
        printArr(commonElem(new int[]{1,2}, new int[]{}));      // {}
        printArr(commonElem(new int[]{1,2}, null));     // null
        printArr(commonElem(null, new int[]{}));         // null
        printArr(commonElem(null, null));        // null
    }

    public static int[] commonElem(int[] first, int[] second) {
        if (first==null || second==null) {
            return null;
        }
        if (first.length==0 || second.length==0) {
            return new int[]{};
        }
        int minLen = 0;
        int[] smaller, larger;
        if (first.length <= second.length) {
            minLen = first.length;
            smaller = first;
            larger = second;
        } else {
            minLen = second.length;
            smaller = second;
            larger = first;
        }

        int idx = 0;
        int[] newArr = new int[minLen];
        for (int i=0; i<smaller.length; i++) {
            for (int j=0; j<larger.length; j++) {
                if (smaller[i]==larger[j]) {
                    newArr[idx++] = smaller[i];
                }
            }
        }

        int[] commonElems = new int[idx];
        for (int i=0; i<idx; i++) {
            commonElems[i] = newArr[i];
        }

        return commonElems;
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("##########");
    }
}