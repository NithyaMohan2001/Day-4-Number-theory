import java.util.*;

class Main {
    static boolean isprime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isprime(n)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
