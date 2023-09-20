package XAU_KY_TU;

import java.util.Scanner;

public class J03008_SO_DEP_3 {
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static String check(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1) || !isPrime(s.charAt(i) - '0') || !isPrime(s.charAt(s.length()-i-1) - '0'))
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
