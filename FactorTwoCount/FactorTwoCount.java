public class FactorTwoCount {
    public static void main(String[] args) {
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }

    public static int factorTwoCount(int n) {
        int count = 0;
        while(n > 1) {
            if (n % 2 == 0) {
                count++;
                n /= 2;
            } else {
                break;
            }
        }
        return count;
    }
}