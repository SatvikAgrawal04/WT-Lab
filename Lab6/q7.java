package Lab6;

public class q7 {

    void area(Double a) {
        double ar = 3.14 * a * a;
        System.out.println("Area of circle is: " + ar);
    }

    void area(double a, double b) {
        double ar = a * b;
        System.out.println("Area of rectangle is: " + ar);
    }

    void area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = ((s - a) * (s - b) * (s - c)) / 2;
        System.out.println("Area of triangle is: " + ar);
    }

    public static void main(String args[]) {
        q7 obj = new q7();
        obj.area(5.1);
        obj.area(5.8, 7.3);
        obj.area(5.3, 6.9, 7.6);
    }

}
