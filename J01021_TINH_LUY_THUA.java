package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01021_TINH_LUY_THUA {
    public static int MOD = (int) 1e9 + 7;
    public static long pow(long a, long b){
        if (b == 0)   return 1;
        if (b == 1)   return a % MOD;
        long tmp = pow(a, b/2);
        if (b%2 == 0)    return (tmp * tmp) % MOD;
        return ((tmp * tmp) % MOD * a) % MOD;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            long a = sc.nextLong(), b = sc.nextLong();
            if (a == 0 && b == 0)   return;
            System.out.println(pow(a, b));
        }
    }
}
