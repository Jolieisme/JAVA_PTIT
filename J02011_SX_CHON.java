package MANG;

import java.util.Scanner;

public class J02011_SX_CHON {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[105];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int min;
        for(int i = 0; i<n-1; i++){
            System.out.print("Buoc " + (i+1) + ": ");
            min = i;
            for(int j = i + 1; j<n; j++){
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;

            for (int x = 0; x < n; x++)
                System.out.print(a[x] + " ");
            System.out.println();
        }
    }
}
