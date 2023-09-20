package XAU_KY_TU;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014_TONG_HAI_SO_NGUYEN_LON {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- >0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
