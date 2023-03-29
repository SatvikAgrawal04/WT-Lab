package Lab6;

public class q4 {
    static int stcount = 0;
    int count = 0;

    public void increment() {
        stcount++;
        count++;
    }

    public static void main(String args[]) {
        q4 obj1 = new q4();
        q4 obj2 = new q4();

        obj1.increment();
        System.out.println("obj1:\nnon-static counter : " + obj1.count + "\n static counter : " + obj1.stcount);
        obj2.increment();
        System.out.println("obj2:\nnon-static counter : " + obj2.count + "\n static counter : " + obj2.stcount);
    }
}
