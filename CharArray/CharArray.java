public class CharArray {
    public static void main(String[] args) {
        System.out.println(f(new char[] {'a','b','c'}, 0, 4)); // null
        System.out.println(f(new char[] {'a','b','c'}, 0, 3)); // abc
        System.out.println(f(new char[] {'a','b','c'}, 0, 2)); // ab
        System.out.println(f(new char[] {'a','b','c'}, 0, 1)); // a
        System.out.println(f(new char[] {'a','b','c'}, 1, 3)); // null
        System.out.println(f(new char[] {'a','b','c'}, 1, 2)); // bc
        System.out.println(f(new char[] {'a','b','c'}, 1, 0)); // {}
    }

    public static char[] f(char[] chars, int start, int len) {
        if (chars.length==0 || len==0 || start<0 || len<0 || len+start>chars.length) {
            return new char[]{};
        }

        char[] newArr = new char[len];
        for (int i=start; i<start+len; i++) {
            newArr[i-start] = chars[i];
        }
        return newArr;
    }
}