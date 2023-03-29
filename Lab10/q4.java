package Lab10;


public class q4 {
    public static void main(String[] args) {
        try{
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException np){
            System.out.println("Null Pointer Exception: " + np.getMessage());
        }

        try{
            int b = 0;
            System.out.println(1/b);
        }catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception: " + ae.getMessage());
        }
    }
}
