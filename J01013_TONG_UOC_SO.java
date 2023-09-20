package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01013_TONG_UOC_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for(int i = 2; i <= 1420; i++){
            if(a[i] == 0){
                for(int j = i*i; j <= 2000000; j += i){
                    if(a[j] == 0){
                        a[j] = i;
                    }
                }
            }
        }

        for(int i = 2; i <= 200000; i++){
            if(a[i] == 0)     a[i] = i;
        }
        
        int test = sc.nextInt();
        long sum = 0;
        while (test-- > 0){
            int number = sc.nextInt();
            while (number > 1){
                sum += a[number];
                number /= a[number];
            }
        }
        System.out.print(sum);
    }
}
