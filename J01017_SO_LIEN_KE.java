package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

import static java.lang.Math.abs;

public class J01017_SO_LIEN_KE {
    public static boolean check(char a, char b){
        int x = a - '0';
        int y = b - '0';
        return Math.abs(a - b) == 1;
    }

    public static String result(String s){
        for(int i = 1; i<s.length(); i++){
            if(!check(s.charAt(i), s.charAt(i-1)))
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String num = sc.next();
            System.out.println(result(num));
        }
    }
}
