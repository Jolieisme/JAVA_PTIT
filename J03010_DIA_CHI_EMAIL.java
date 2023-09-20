package XAU_KY_TU;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DIA_CHI_EMAIL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        ArrayList<String> mark = new ArrayList<>();
        while(test-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            int n = a.length;
            String result = a[n-1];
            for(int i = 0; i <n-1; i++){
                result += a[i].charAt(0);
            }
            mark.add(result);
            int cnt = Collections.frequency(mark, result);
            result += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
            System.out.println(result);
        }
    }
}
