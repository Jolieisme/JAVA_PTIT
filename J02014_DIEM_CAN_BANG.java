package MANG;

import java.util.Scanner;

public class J02014_DIEM_CAN_BANG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sum = new int[n];
            for(int i = 0; i<n; i++)   a[i] = sc.nextInt();
            sum[0] = a[0];

            for(int i = 1; i<n; i++){
                sum[i] = sum[i-1] + a[i];
            }

            int idx = -1;
            for(int i = 1; i<n; i++){
                if(sum[i-1] == sum[n-1] - sum[i]){
                    idx = i+1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}
