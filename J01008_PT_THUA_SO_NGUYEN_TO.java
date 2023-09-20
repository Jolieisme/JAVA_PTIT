package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01008_PT_THUA_SO_NGUYEN_TO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i<=test; i++){
            int number = sc.nextInt();
            int cnt = 0;
            System.out.print("Test " + i + ": ");
            for (int j = 2; j <= Math.sqrt(number); j++){
                if(number % j == 0) {
                    cnt = 0;
                    while (number % j == 0) {
                        cnt++;
                        number /= j;
                    }
                    System.out.print(j + "(" + cnt + ")" + " ");
                }
            }
            if (number > 1)
                System.out.print(number + "(1)");
            System.out.println();
        }
    }
}
