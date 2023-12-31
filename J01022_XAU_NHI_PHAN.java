package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01022_XAU_NHI_PHAN {
    public static long[] f = new long[100];
    public static void fibo(){
        f[1] = f[2] = 1;
        for (int i = 3; i<=95; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }

    public static char find_char(int n, long k){
        if (n == 1)
            return '0';
        if (n == 2)
            return '1';
        if (k <= f[n-2])
            return find_char(n-2, k);
        return find_char(n-1, k - f[n-2]);
    }

    public static void main(String[] args){
        fibo();
        Scanner sc = new Scanner(System.in);
        int test =  sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find_char(n, k));
        }
    }
}
