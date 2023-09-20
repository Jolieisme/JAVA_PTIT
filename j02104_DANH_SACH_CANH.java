package MANG;

import java.util.Scanner;

public class j02104_DANH_SACH_CANH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+5][n+5];
        int[] mark = new int[n+5];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(a[i][j] == 1){
                    System.out.println("(" + i + "," + j + ")");
                    a[i][j] = 0;
                    a[j][i] = 0;
                }
            }
        }
    }
}
