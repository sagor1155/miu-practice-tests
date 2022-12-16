public class CharArray {
    public static void main(String[] args) {
        System.out.println(f(new char[] {'a','b','c'}, 0, 4));
        System.out.println(f(new char[] {'a','b','c'}, 0, 3));
        System.out.println(f(new char[] {'a','b','c'}, 0, 2));
        System.out.println(f(new char[] {'a','b','c'}, 0, 1));
        System.out.println(f(new char[] {'a','b','c'}, 1, 3));
        System.out.println(f(new char[] {'a','b','c'}, 1, 2));
        System.out.println(f(new char[] {'a','b','c'}, 1, 0));
    }

    public static char[] f(char[] chars, int start, int len) {

        if(start < 0 || len < 0 || len + start > chars.length) {
            return new char[]{};
        }
        char[] result = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            result[j] = chars[i];
        }
        return result;
    }
}