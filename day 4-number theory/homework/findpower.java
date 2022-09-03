import java.util.*;

class Main {
    static int findpower(int n, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++)
            res *= n;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(findpower(n, p));
    }
}
