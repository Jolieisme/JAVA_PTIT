package LAP_TRINH_JAVA_CO_BAN;

import java.util.*;

public class J01005_CHIA_TAM_GIAC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            double n = sc.nextInt(), h = sc.nextInt();
            for(int i = 1; i<n; i++){
                System.out.printf("%.6f ", h * Math.sqrt(i / n));
            }
            System.out.println();
        }
    }
}
