package XAU_KY_TU;

import java.util.Scanner;

public class J03032_DAO_TU {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            for(String i : a){
                StringBuilder tmp = new StringBuilder(i);
                System.out.print(tmp.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
