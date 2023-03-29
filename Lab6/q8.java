package Lab6;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;

        void dispSum() {
            int sum = x + y;
            System.out.println(sum);
        }
    }
}

public class q8 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        myInner.dispSum();
    }
}
