package MANG;

import java.util.Scanner;

public class J02006_HOP_CUA_HAI_DAY_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[1005], b = new int[1005];
        int[] cnt = new int[1005];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        for(int j = 0; j<m; j++) {
            b[j] = sc.nextInt();
            cnt[b[j]]++;
        }

        for(int x = 1; x<1000; x++){
            if(cnt[x] > 0)
                System.out.print(x + " ");
        }
    }
}
