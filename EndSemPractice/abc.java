package EndSemPractice;
import EndSemPractice.Geometry.circle;
public class abc {
    public static void main(String[] args) {
        circle obj = new circle();
        double a = 10;
        obj.setRadius(a);
        double r = obj.getRadius();
        double ar = 3.14 * r * r;
        double peri = 2 * 3.14 * r;
        System.out.println("area : " + ar + "perimeter: " + peri);
    }
}
