package MANG;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105_DS_KE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer>[] arr = new ArrayList[n+5];

        for(int i = 1; i<=n; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                int x = sc.nextInt();
                if(x == 1){
                    arr[i].add(j);
                }
            }
        }

        for(int i = 1; i<=n; i++){
            System.out.printf("List" + "(" + i + ")" + " = ");
            for(int j : arr[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
