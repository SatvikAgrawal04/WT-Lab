public class test {
    public static void main(String[] args) {
        int notPrimeCt = 0;
        for (int i = 0; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            for (int j = 2; j < a / 2; j++) {
                if (a%j == 0){
                    notPrimeCt++;
                    break;
                }
            }
        }
        int primeCt = args.length - notPrimeCt;
        System.out.println(primeCt);
    }
}