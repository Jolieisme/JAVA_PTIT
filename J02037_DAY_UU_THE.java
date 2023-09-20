package XAU_KY_TU;

import java.util.Scanner;

public class J02037_DAY_UU_THE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            int even = 0, odd = 0;
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(String i : a){
                int tmp = Integer.parseInt(i);
                if(tmp % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(a.length % 2 == 0 && even > odd || a.length % 2 == 1 && odd > even){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
