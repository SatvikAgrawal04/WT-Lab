package Lab10;

import java.util.Scanner;

class InputException{
    void processInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0){
            throw NegativeNumberException;
        }
    }
}
public class q5 {
    public static void main(String[] args) {

    }
}
