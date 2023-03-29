package Lab10;

import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String str){
        System.out.println(str);
    }
}

class InputException{
    void processInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            if (a < 0){
                throw new NegativeNumberException("Negative value Entered");
            }

            System.out.println(2*a);
        }catch (NegativeNumberException m){}
    }
}
public class q5 {
    public static void main(String[] args) {
        InputException obj = new InputException();
        obj.processInput();
    }
}
