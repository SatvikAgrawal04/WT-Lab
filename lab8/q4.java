package lab8;

import java.util.Scanner;

abstract class Student {
    int roll_no;
    int reg_no;

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Roll no and Reg no: ");
        roll_no = s.nextInt();
        reg_no = s.nextInt();

        System.out.println("Roll No: " + roll_no + "\nRegistration no: " + reg_no + "\nCourse: CSE");
    }
}


public class q4 {
    public static void main(String[] args) {
        Kiitian obj = new Kiitian();
        obj.course();
    }
}
