package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01024_SO_TAM_PHAN {
    public static String check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')
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
