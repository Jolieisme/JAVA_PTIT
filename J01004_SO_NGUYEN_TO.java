package LAP_TRINH_JAVA_CO_BAN;
import java.lang.Math;
import java.util.Scanner;

public class J01004_SO_NGUYEN_TO {
    static String isPrime(int n){
        if (n == 2 || n == 3)
            return "YES";
        if (n < 2 || n % 2 == 0 || n % 3 == 0)
            return "NO";
        for (int i = 5; i <= Math.sqrt(n); i += 6){
            if(n % i == 0 || n % (i+2) == 0)
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int number = sc.nextInt();
            System.out.println(isPrime(number));
            test--;
        }
    }
}
