package XAU_KY_TU;

import java.util.Scanner;

public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;
            for(int i = 1; i < n - 1; i++){
                System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
            }
            System.out.print(String.valueOf(a[n - 1].charAt(0)).toUpperCase() + a[n - 1].substring(1) + ", ");
            System.out.print(a[0].toUpperCase());
        }
    }
}
