import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            FileInputStream f1 = new FileInputStream(fileName);
            FileInputStream f2 = new FileInputStream("newFile.txt");
            SequenceInputStream f3 = new SequenceInputStream(f1, f2);
            int ch;
            while ((ch = f3.read()) != -1) {
                System.out.println((char) ch);
            }
            f1.close();
            f2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}