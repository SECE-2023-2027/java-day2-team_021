public class Qn2 {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        int cnt = 1;
        int num = 1;
        while (cnt <= 100) {
            if (isPrime(num)) {
                sum += num;
                cnt++;
            }
            num++;
        }
        System.out.print(sum);
    }
}
