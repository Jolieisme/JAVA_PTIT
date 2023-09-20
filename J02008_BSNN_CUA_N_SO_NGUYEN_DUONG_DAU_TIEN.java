package MANG;

import java.security.PublicKey;
import java.util.Scanner;

public class J02008_BSNN_CUA_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static long gcd(long a, long b){
        if(b == 0)    return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b){
        return (a * b) / gcd(a,b);
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            long BCNN = 1;
            int n = sc.nextInt();
            for(int i = 2; i<=n; i++){
                 BCNN = lcm(BCNN, (long) i);
            }
            System.out.println(BCNN);
        }
    }
}
