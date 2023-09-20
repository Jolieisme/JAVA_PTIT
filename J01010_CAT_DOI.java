package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01010_CAT_DOI {
    public static long solve(String s){
        long n = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '0':
                case '8':
                case '9':
                    n = n * 10;
                    break;
                case '1':
                    n = n * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }
        return n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String number = sc.next();
            long result = solve(number);
            if (result == 0)
                System.out.println("INVALID");
            else
                System.out.println(result);
        }
    }
}
