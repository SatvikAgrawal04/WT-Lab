package Lab12;

import java.util.Scanner;
import java.io.*;

public class q1 {
    public static void main(String[] args) {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter roll number:");
            int roll = obj.nextInt();
            System.out.println("Enter name:");
            String name = obj.next();
            System.out.println("Enter marks:");
            int marks = obj.nextInt();
            FileWriter file = new FileWriter("file1.txt");
            file.write("Roll number: " + roll + "\n");
            file.write("Name: " + name + "\n");
            file.write("Marks: " + marks + "\n");
            file.close();
            FileInputStream obj2 = new FileInputStream("file1.txt");
            int ch;
            while ((ch = obj2.read()) != -1) {
                System.out.print((char) ch);
            }
            obj2.close();
            obj.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}