package lab7;

class  vehicle{
    void num(){
        System.out.println("vehicle class");
    }
}
class car extends vehicle{
    protected void num(){
        System.out.println("car class");
    }
}
class bike extends vehicle{
    public void num(){
        System.out.println("bike class");
    }
}
class truck extends vehicle{
    void num(){
        System.out.println("truck class");
    }
}
public class q9 {
    public static void main(String args[]) {
        vehicle obj;
        car obj1 = new car();
        bike obj2 = new bike();
        truck obj3 = new truck();
        obj = obj1;
        obj.num();
        obj = obj2;
        obj.num();
        obj = obj3;
        obj.num();
    }
}