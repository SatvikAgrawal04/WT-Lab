/*
2. Write a menu driven program in java which will do the following operations using scanner
    a. Addition of two number
    b. Multiplication of two numbers
    c. Division of two numbers
    d. Subtractions of two numbers
 */
package LAB5;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;
        System.out.print("Enter two numbers- ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        while (true) {
            System.out.println("\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n5)Quit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("\nResult: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("\nResult: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("\nResult: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("\nResult: " + (num1 / num2));
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }
        }
        sc.close();
    }
}