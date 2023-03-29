package Lab6;

public class q2 {
    final int x = 10;

    public static void main(String[] args) {
        q2 obj = new q2();
        // obj.x = 25;
        // this will generate an error because a final variable cannot be reassigned
        // another value
        System.out.println(obj.x);
    }
}
