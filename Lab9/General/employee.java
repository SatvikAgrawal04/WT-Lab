package Lab9.General;

import java.util.Scanner;

public class employee {
    protected int empid;
    private String ename;
    public double earning(){
        double earning;
        double basic;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary: ");
        basic = sc.nextDouble();
        double da = (0.8) * basic;
        double hra = (0.15) * basic;
        earning = basic + da + hra;
        return earning;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empid: ");
        empid = sc.nextInt();
        System.out.println("Enter name: ");
        ename = sc.next();
    }
}
