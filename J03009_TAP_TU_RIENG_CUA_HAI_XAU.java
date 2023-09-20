package XAU_KY_TU;

import java.util.HashSet;
import java.util.Scanner;

public class J03009_TAP_TU_RIENG_CUA_HAI_XAU {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){

    }
    public static void main(String[] args){
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String[] a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> c = new HashSet<>();
            for (String i : a){
                if (!b.contains(i)){
                    c.add(i);
                }
            }
            for (String i : c){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
