package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01003_GIAI_PT_BAC_NHAT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a == 0){
            if (b == 0)
                System.out.print("VSN");
            else
                System.out.print("VN");
        }
        else {
            System.out.printf("%.2f", -b / a);
        }
    }
}
