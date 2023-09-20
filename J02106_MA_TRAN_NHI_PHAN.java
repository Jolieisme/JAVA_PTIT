package MANG;

import java.util.Scanner;

public class J02106_MA_TRAN_NHI_PHAN {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+5][3];
        int result = 0;
        for(int i = 0; i<n; i++){
            int cnt = 0;
            for(int j = 0; j<3; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1)
                    cnt++;
            }

            if(cnt > 3 - cnt)
                result++;
        }
        System.out.print(result);
    }
}
