package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01002_TINH_TONG_N_SO_NGUYEN_DUONG_DAU_TIEN {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0){
            long input = sc.nextLong();
            System.out.println(input * (input+1)/2);
            test--;
        }
    }
}
