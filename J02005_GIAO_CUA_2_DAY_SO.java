package MANG;

import java.util.Scanner;

public class J02005_GIAO_CUA_2_DAY_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), A[] = new int[1005], B[] = new int[1005];
        for (int i = 0; i < n; i++){
            A[sc.nextInt()] = 1;
        }
        for (int i = 0; i<m; i++){
            B[sc.nextInt()] = 1;
        }

        for(int i = 0; i < 1000; i++){
            if(A[i] == 1 && B[i] == 1){
                System.out.print(i + " ");
            }
        }

    }
}
