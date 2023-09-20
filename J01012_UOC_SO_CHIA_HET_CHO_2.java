package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int cnt = 0;
            int number = sc.nextInt();
            for(int i = 1; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    if(i % 2 == 0)
                        cnt++;
                    if ((number/i) % 2 == 0 && i != Math.sqrt(number))
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
