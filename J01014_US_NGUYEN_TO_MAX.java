package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01014_US_NGUYEN_TO_MAX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long result = -1;
        while(test-- > 0){
            long number = sc.nextLong();
            for (int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    result = Math.max(result, i);
                    while(number % i == 0){
                        number = number / i;
                    }
                }
            }
            if(number > 1)     result = Math.max(result, number);
            System.out.println(result);
        }
    }
}
