public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
        System.out.println(isSquare(225));
    }

    public static int isSquare(int number) {
        int limit = number / 2;
        int num = 0;
        while (num <= limit) {
            if(num*num == number) {
                return 1;
            }
            num++;
        }
        return 0;
    }
}