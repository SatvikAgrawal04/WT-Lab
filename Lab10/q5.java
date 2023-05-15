package Lab10;

import java.util.*;

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        super();
    }
}

class InputException {
    void processInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            if (a < 0) {
                throw new NegativeNumberException();
            }

            System.out.println(2 * a);
        } catch (NegativeNumberException m) {
            System.out.println("negative number entered");
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        InputException obj = new InputException();
        obj.processInput();
    }
}
