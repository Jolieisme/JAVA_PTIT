package XAU_KY_TU;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HIEU_SO_NGUYEN_LON_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.next());
        while(test-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String s = String.valueOf(a.subtract(b).abs());
            int MAX = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while(s.length() < MAX){
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
