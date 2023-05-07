import Geometry.circle;

public class abc {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(10);
        int r = obj.getRadius();
        double ar = 3.14 * r * r;
        double peri = 2 * 3.14 * r;
        System.out.println("area : " + ar + "perimeter: " + peri);
    }
}
