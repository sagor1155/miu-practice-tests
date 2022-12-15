public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci(0));
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(21));
    }

    public static int isFibonacci(int n) {
        int first = 1;
        int second = 1;
        while (second < n) {
            int temp = second;
            second = first+second;
            first = temp;
        }
        if(n==second) return 1;
        return 0;
    }
}