package E03;

public class AnadromiMethods {

    // Άσκηση 3

    public static int par(int n) {
        int sum = 1;
        if(n == 0) return sum;
        else sum = n * par(n - 1);

        return sum;
    }

    public static int fibo(int n) {
        int sum = 1;
        if(n == 0 || n == 1) return sum;
        else sum =  fibo(n - 2) + fibo(n - 1);
        return sum;
    }

    public static int pal(int num, int rev) {
        if(num > 0){
            rev = (rev * 10) + (num % 10);
            rev = pal(num / 10, rev);
        }
        return rev;
    }

    public static boolean firstnum(int n, int i){
        boolean firstNum = true;
        if (i < n){
            if (n % i != 0) firstNum = firstnum(n, i + 1);
            else firstNum = false;
        }
        return firstNum;
    }

    public static int Hanoi(int n){
        int sum = 1;

        if (n == 1) return sum;
        else sum = 2 * Hanoi(n-1) + 1;

        return sum;
    }
}
