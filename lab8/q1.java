package lab8;

class A {
    int a;

    A() {
        a = 5;
    }

    void disp() {
        System.out.println("Inside A");
    }
}

class B extends A {
    void disp() {
        System.out.println("Inside B");
        System.out.println("value of a in derived class: " + super.a);
        super.disp();
    }
}

public class q1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.disp();
    }
}
