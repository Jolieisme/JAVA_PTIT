package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;

public class J01001_HINH_CHU_NHAT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Length = scanner.nextInt();
        int Width = scanner.nextInt();
        if(Length <= 0 || Width <= 0)
           System.out.println(0);
        else {
            System.out.print((Length + Width) * 2 + " ");
            System.out.println(Length * Width);
        }
    }
}
