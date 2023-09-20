package XAU_KY_TU;

import java.util.Scanner;

public class J03021_DIEN_THOAI_CUC_GACH {
    public static String convert(Character c){
        if(c <= 'c')
            return "2";
        else if(c <= 'f')
            return "3";
        else if(c <= 'i')
            return "4";
        else if(c <= 'l')
            return "5";
        else if(c <= 'o')
            return "6";
        else if(c <= 's')
            return "7";
        else if(c <= 'v')
            return "8";
        return "9";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0){
             String s = sc.next().toLowerCase();
             String a = "";
             for(int i = 0; i<s.length(); i++){
                 a += convert(s.charAt(i));
             }

             String reverse = new StringBuilder(a).reverse().toString();
             if(a.equals(reverse))
                 System.out.println("YES");
             else
                 System.out.println("NO");
        }
    }
}
