package lab8;

public class q3 {
    public static void main(String[] args) {
        shape sh;
        circle cr = new circle();
        sh = cr;
        sh.getData();
        sh.calculateArea();

        square sq = new square();
        sh = sq;
        sh.getData();
        sh.calculateArea();

        triangle tri = new triangle();
        sh = tri;
        sh.getData();
        sh.calculateArea();
    }
}
