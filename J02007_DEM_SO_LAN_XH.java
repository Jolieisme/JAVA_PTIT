package MANG;

import java.util.Scanner;

public class J02007_DEM_SO_LAN_XH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t = 1; t<= test; t++){
            int n = sc.nextInt();
            int[] a = new int[n+5], cnt = new int[100005];
            for(int i = 0 ;i<n; i++){
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }

            System.out.println("Test" + t + ":");
            for(int i : a){
                if(cnt[i] > 0){
                    System.out.println(i + " xuat hien " + cnt[i] + " lan");
                    cnt[i] = 0;
                }
            }
        }
    }
}
