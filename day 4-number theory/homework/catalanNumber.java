import java.io.*;
import java.util.*;

class Catalan {
    int catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int cn = 0;

        for (int i = 0; i < n; i++) {
            cn = cn + catalan(i) * catalan(n - i - 1);
        }
        return cn;
    }

    public static void main(String args[]) {
        Catalan c = new Catalan();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(c.catalan(i));
        }
    }
}
