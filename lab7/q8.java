package lab7;

class cons {
    cons(int a) {
        System.out.println(a);
    }
}

class q8 extends cons {
    q8(int a) {
        super(a);
        System.out.println("derived class constructor");

    }

    public static void main(String[] args) {
        q8 obj = new q8(10);

    }
}