package LAP_TRINH_JAVA_CO_BAN;

import java.util.Arrays;
import java.util.Scanner;

public class J01007_KT_SO_FIBO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] f = new long[95];
        f[0] = 0;
        f[1] = f[2] = 1;
        for(int i = 3; i <=92 ; i++){
            f[i] = f[i-1] + f[i-2];
        }

        int test = sc.nextInt();
        while (test-- > 0){
            long n = sc.nextLong();
            int idx = Arrays.binarySearch(f, 0, 92, n);
            if (idx < 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
