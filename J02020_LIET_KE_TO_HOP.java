package MANG;

import java.util.Scanner;

public class J02020_LIET_KE_TO_HOP {
    public static int n, k, cnt = 0;
    public static int[] a = new int[15];

    public static void print(){
        cnt++;
        for(int i = 1; i<=k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void Try(int i) {
        for(int j = a[i-1] + 1; j <= n-k+i; j++){
            a[i] = j;
            if(i == k){
                print();
            }
            else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.print("Tong cong co " + cnt + " to hop");
    }
}
