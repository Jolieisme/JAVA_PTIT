package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01006_TINH_SO_FIBO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] f = new long[95];
        f[1] = f[2] = 1;
        for (int i = 3; i <= 92; i++){
            f[i] = f[i-1] + f[i-2];
        }

        int test = sc.nextInt();
        while (test-- > 0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
