/*WAP in java which will acccept two integer and display thier sum using SCanner class*/

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.println("The sum of the two integers is: " + (num1 + num2));
        sc.close();
    }
}
