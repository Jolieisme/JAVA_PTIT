package MANG;

import java.util.Scanner;

public class J02022_SO_XA_CACH {
    public static int n;
    public static int[] a;
    public static boolean[] mark;
    public static void check() {
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (mark[j] == false) {
                mark[j] = true;
                a[i] = j;
                if (i == n) {
                    check();
                } else {
                    Try(i + 1);
                }
                mark[j] = false;
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            n = sc.nextInt();
            a = new int[n+1];
            mark = new boolean[n+1];
            Try(1);
        }
    }
}
