public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(8));
    }

    public static int isFibonacci(int n) {
        int fib = 1, first = 0, second = 0;
        while(fib <= n) {
            if(fib == n) {
                return 1;
            }
            first = second;
            second = fib;
            fib = first + second;
        }
        return 0;
    }
}