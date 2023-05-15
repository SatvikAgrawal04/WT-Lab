import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class q3 {
    public static void main(String[] args) {
        try {
            BufferedReader ipFile = new BufferedReader(new FileReader("file1.txt"));
            BufferedWriter opFile = new BufferedWriter(new FileWriter("file2.txt"));
            int c;
            while ((c = ipFile.read()) != -1) {
                if (Character.isLowerCase((char) c)) {
                    opFile.write(Character.toUpperCase((char) c));
                } else {
                    opFile.write(Character.toLowerCase((char) c));
                }
            }
            ipFile.close();
            opFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
