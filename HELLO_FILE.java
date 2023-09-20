package LAP_TRINH_JAVA_CO_BAN;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLO_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()){
             System.out.println(sc.nextLine());
        }
    }
}

