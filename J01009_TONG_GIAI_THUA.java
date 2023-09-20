package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01009_TONG_GIAI_THUA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        long tmp = 1;
        for (int i = 1; i<=n; i++){
            tmp *= i;
            result += tmp;
        }
        System.out.println(result);
    }
}
