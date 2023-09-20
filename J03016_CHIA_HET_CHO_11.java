package XAU_KY_TU;

import java.math.BigInteger;
import java.util.Scanner;

public class J03016_CHIA_HET_CHO_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("11");
            if(a.mod(b).toString().equals("0")){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
