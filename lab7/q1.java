package lab7;

import java.util.Scanner;

class rectangle{
    double length;
    double breadth;

    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        length = s.nextDouble();
        breadth = s.nextDouble();
    }
    void area()
    {
        double area = length * breadth;
        System.out.println("Area is: " + area);
    }
    void perimetre()
    {
        double p = 2*(length + breadth);
        System.out.println("Perimetre is: " + p);
    }
}

public class q1 {
    public static void main(String[] args) {
        rectangle obj1 = new rectangle();
        obj1.getData();
        obj1.area();
        obj1.perimetre();
    }
}
