package XAU_KY_TU;

import java.util.Scanner;

public class J03004_CHUAN_HOA_XAU_HO_TEN_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            for(String i : a){
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
