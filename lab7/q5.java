package lab7;

import java.util.Scanner;

class shape{
    double area;
    void showArea(){
        System.out.println("Area is: " + area);
    }
}

class circle extends shape{
    double rad;
    void getData(){
        System.out.println("Enter radius: ");
        Scanner s = new Scanner(System.in);
        rad = s.nextDouble();
    }
    void calculate(){
        double ar = 3.14 * rad * rad;
        super.area = ar;
    }
}

class Rect extends shape{
    double len, width;
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and width: ");
        len = s.nextDouble();
        width = s.nextDouble();
    }
    void calculate(){
        double ar = len * width;
        super.area = ar;
    }
}

public class q5 {
    public static void main(String[] args) {

    shape obj1 = new shape();
    circle cr = new circle();
    cr.getData();
    cr.calculate();
    cr.showArea();
    Rect rec = new Rect();
    rec.getData();
    rec.calculate();
    rec.showArea();
    }
}
