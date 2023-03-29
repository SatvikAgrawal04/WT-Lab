package Lab6;

class Student {
    // instance variables of the class
    int id;
    String name;

    Student() {
        System.out.println("this a default constructor");
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void disp() {
        System.out.println("id: " + id + "\nname: " + name);
    }
}

public class q6 {
    public static void main(String args[]) {
        Student s2 = new Student();
        Student s1 = new Student(1, "abc");
        s1.disp();
    }
}
