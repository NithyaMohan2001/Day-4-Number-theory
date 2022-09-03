import java.util.*;

class Main {
    static int combination(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(combination(n, r));
    }
}