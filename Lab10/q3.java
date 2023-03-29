package Lab10;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        try {
            int a = 0;
            double b = 1 / a;
        } catch (ArithmeticException ae) {
            System.out.println("Arithematic Exception: " + ae.getMessage());
        }
        finally {
            System.out.println("Exception caught");
        }
    }
}
