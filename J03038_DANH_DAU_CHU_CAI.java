package XAU_KY_TU;

import java.util.Scanner;

public class J03038_DANH_DAU_CHU_CAI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] f = new int[150];
        int cnt = 0;
        String s = sc.next();
        for(int i = 0; i<s.length(); i++){
            if (f[s.charAt(i)] == 0) {
                f[s.charAt(i)] = 1;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
