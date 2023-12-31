package MANG;

import java.util.Scanner;

public class J02013_SX_NOI_BOT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<n-1; i++){
            boolean isSorted = true;
            for(int j = 0; j<n-1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted){
                return;
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
