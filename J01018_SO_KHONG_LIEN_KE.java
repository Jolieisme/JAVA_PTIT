package MANG;

import java.util.Scanner;

public class J01018_SO_KHONG_LIEN_KE {
    public static boolean check1(char a, char b){
        int x = a - '0';
        int y = b - '0';
        return (Math.abs(x - y) == 2);
    }

    public static String check2(String s){
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            if(check1(s.charAt(i), s.charAt(i-1))) {
                sum += (s.charAt(i-1) - '0');
            }
            else
                return "NO";
        }
        sum += (int)(s.charAt(s.length() - 1) - '0');
        if(sum % 10 == 0)    return "YES";
        return "NO";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            String s = sc.next();
            System.out.println(check2(s));
        }
    }
}
