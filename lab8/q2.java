package lab8;

import java.util.Scanner;

abstract class shape {
    double ar;

    abstract void calculateArea();

    abstract void getData();
}

class square extends shape {
    double a;

    void getData() {
        System.out.print("Enter side: ");
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
    }

    void calculateArea() {
        super.ar = a * a;
        System.out.printf("area is %s%n", ar);
    }
}

class triangle extends shape {
    double b, h;

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        b = s.nextDouble();
        h = s.nextDouble();
    }

    void calculateArea() {
        super.ar = (h * b) / 2;
        System.out.printf("area is %s%n", ar);
    }
}

class circle extends shape {
    double r;

    void getData() {
        System.out.print("Enter radius: ");
        Scanner s = new Scanner(System.in);
        r = s.nextDouble();
    }

    void calculateArea() {
        super.ar = 3.14 * r * r;
        System.out.printf("area is %s%n", ar);
    }
}

public class q2 {
    public static void main(String[] args) {
        circle cr = new circle();
        cr.getData();
        cr.calculateArea();

        square sq = new square();
        sq.getData();
        sq.calculateArea();

        triangle tri = new triangle();
        tri.getData();
        tri.calculateArea();
        System.out.println(cr.ar);
    }
}
