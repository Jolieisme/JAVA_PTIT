package XAU_KY_TU;

import java.util.Scanner;

public class J03007_SO_DEP_2 {
    public static int sum = 0;
    public static String check(String s){
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8')
            return "NO";
        for(int i = 1; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return "NO";
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 == 1)   return "NO";
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
