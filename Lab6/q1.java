package Lab6;

public class q1 {

        public static void main(String[] var0) {
            for(int var1 = 0; var1 < 10; ++var1) {
                if (var1 == 3) {
                    continue;
                }
                System.out.println(var1);
                if (var1 == 8) {
                    break;
                }
            }

        }

}
