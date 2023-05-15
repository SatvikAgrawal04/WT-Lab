
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to read from: ");
        String file1Name = sc.nextLine();
        System.out.print("Enter file name to write in: ");
        String file2name = sc.nextLine();
        FileReader f1 = null;
        FileWriter f2 = null;
        try {
            f1 = new FileReader(file1Name);
            f2 = new FileWriter(file2name);
            int ch;
            while ((ch = f1.read()) != -1) {
                if (Character.isUpperCase((char) ch)) {
                    f2.write(Character.toLowerCase((char) ch));
                } else {
                    f2.write(Character.toUpperCase((char) ch));
                }
            }
            f1.close();
            f2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}