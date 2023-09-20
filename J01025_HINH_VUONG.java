package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01025_HINH_VUONG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int Xmax = Math.max(x1, Math.max(x2, Math.max(x3, x4))), Xmin = Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int Ymax = Math.max(y1, Math.max(y2, Math.max(y3, y4))), Ymin = Math.min(y1, Math.min(y2, Math.min(y3, y4)));
        int c = Math.max(Xmax - Xmin, Ymax - Ymin);
        System.out.print(c * c);
    }
}
