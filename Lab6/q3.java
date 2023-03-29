package Lab6;

public class q3 {
    static int count = 0;

    public void increment() {
        count++;
    }

    public static void main(String args[]) {
        q3 obj1 = new q3();
        q3 obj2 = new q3();
        obj1.increment();
        System.out.println("Obj1: count is=" + obj1.count);
        obj2.increment();
        System.out.println("Obj2: count is=" + obj2.count);
    }
}
