package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01026_SO_CHINH_PHUONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            int number = sc.nextInt();

            if ((int)Math.sqrt(number) == Math.sqrt(number)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
