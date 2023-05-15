import java.io.FileReader;
import java.io.FileWriter;

public class q8 {
    public static void main(String[] args) {
        try {
            FileReader f1 = new FileReader("file1.txt");
            FileWriter fw = new FileWriter("file2.txt");
            int ch;
            while (((ch = f1.read()) != -1)) {
                fw.write(ch);
            }

            FileReader f2 = new FileReader("file2.txt");
            int c1;
            int c2;
            int f = 0;
            while (((c1 = f1.read()) != -1) && ((c2 = f2.read()) != -1)) {
                if (c1 != c2) {
                    f = 1;
                    break;
                }
            }
            if (f == 1) {
                System.out.println("Files are not equal");
            } else {
                System.out.println("Files are equal");
            }

            fw.close();
            f1.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
