package MANG;

import java.util.Scanner;

public class J02103_TICH_MA_TRAN_VOI_CHUYEN_VI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t<=test; t++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n + 5][m + 5];
            int[][] b = new int[m + 5][n + 5];
            int[][] c = new int[n + 5][n + 5];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }

            for(int i = 1; i<=n; i++){
                for(int j = 1; j<=n; j++){
                    c[i][j] = 0;
                    for(int k = 1; k<=m; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Test " + t + ":");

            for(int i = 1; i<=n; i++){
                for(int j = 1; j<=n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
