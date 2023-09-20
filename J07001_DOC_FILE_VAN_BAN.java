package VAO_RA_FILE;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07001_DOC_FILE_VAN_BAN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
