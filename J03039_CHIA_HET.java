package XAU_KY_TU;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class J03039_CHIA_HET {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.next());
        while(test-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            if(a.mod(b).toString().equals("0") || b.mod(a).toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
