//1.Definition class : Circle, Application class: Circle demo
//      radius
//      void setDim(float)
//      void findArea();
//      void findPerimete
package LAB5;

import java.util.Scanner;

class Circle {
    double radius;

    public void input(double r) {
        radius = r;
    }

    void findArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }

    void findPerimeter() {
        double peri = 2 * 3.14 * radius;
        System.out.println("Perimeter of the circle is " + peri);
    }
}

class q1 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.print("Enter radius: ");
        Scanner s = new Scanner(System.in);
        double rad = s.nextInt();
        s.close();
        obj.input(rad);
        obj.findArea();
        obj.findPerimeter();
    }
}
