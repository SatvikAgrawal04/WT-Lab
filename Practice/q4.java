
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class q4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
