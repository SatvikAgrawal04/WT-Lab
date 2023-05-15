package EndSemPractice;
import EndSemPractice.Calculator.Number;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            Number obj = new Number(i);
            double s = obj.findSquare();
            sum += 1.0/s;
        }
        System.out.println(sum);
    }
}
