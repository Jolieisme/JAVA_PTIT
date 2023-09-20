package XAU_KY_TU;

import java.util.Scanner;

public class J03006_SO_DEP_1 {
    public static String check(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1) || (s.charAt(i) - '0') % 2 == 1)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
