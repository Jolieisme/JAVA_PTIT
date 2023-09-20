package XAU_KY_TU;

import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int cnt = 0;
            String s = sc.next();
            int len = s.length();
            for(int i = 0; i<len/2; i++){
                if(s.charAt(i) != s.charAt(len - i - 1))
                    cnt++;
            }
            if(len % 2 == 0 && cnt == 1 || len % 2 == 1 && cnt <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
