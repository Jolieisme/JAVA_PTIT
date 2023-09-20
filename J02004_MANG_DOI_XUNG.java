package MANG;

import java.util.Scanner;

public class J02004_MANG_DOI_XUNG {
    public static String solve(int n, int a[]){
        for(int i = 0; i<n/2 ; i++){
            if(a[i] != a[n-i-1])
                return "NO";
        }
        return "YES";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] a = new int[105];
            for(int i = 0; i<n; i++)
                a[i] = sc.nextInt();

            System.out.println(solve(n, a));
        }
    }
}
