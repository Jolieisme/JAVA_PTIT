package MANG;

import java.util.Scanner;

public class J02034_BO_SUNG_DAY_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mark = new int[105];
        int MAX = -1;
        while(n-- > 0){
            int x = sc.nextInt();
            MAX = Math.max(MAX, x);
            mark[MAX] = 1;
        }

        boolean excellent = true;
        for(int i = 1; i<=MAX; i++){
            if(mark[i] == 0) {
                System.out.println(i);
                excellent = false;
            }
        }

        if(excellent)
            System.out.print("Excellent!");
    }
}
