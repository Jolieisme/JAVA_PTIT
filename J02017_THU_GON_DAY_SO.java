package MANG;

import java.util.Scanner;
import java.util.Stack;

public class J02017_THU_GON_DAY_SO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        int n = sc.nextInt();
        while(n-- > 0){
            int x = sc.nextInt();
            if (!st.empty() && (x + st.peek()) % 2 == 0){
                st.pop();
            }
            else    st.push(x);
        }

        System.out.println(st.size());
    }
}
