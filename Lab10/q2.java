package Lab10;

public class q2 {
    public static void main(String[] args) {
        try {
            // some code that throws an ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException np) {
            System.out.println("Caught NullPointerException: " + np.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("After try catch block");
    }
}
