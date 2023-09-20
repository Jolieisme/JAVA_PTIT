package MANG;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J02012_SX_XEP_CHEN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> a = new ArrayList<>();
        for(int i = 0; i<n; i++){
            a.add((sc.nextInt()));
            System.out.print("Buoc " + i + ": ");
            Collections.sort(a);
            for(int j : a){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
