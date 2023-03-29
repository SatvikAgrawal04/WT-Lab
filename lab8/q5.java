package lab8;

class Bank {
    protected double ROI;

    public Bank(double ROI) {
        this.ROI = ROI;
    }

    public void find_ROI() {
        System.out.println("The ROI of the bank is " + ROI);
    }
}

class HDFC extends Bank {
    public HDFC(double ROI) {
        super(ROI);
    }

    public void find_ROI() {
        System.out.println("The ROI of HDFC bank is " + ROI);
    }
}

class ICICI extends Bank {
    public ICICI(double ROI) {
        super(ROI);
    }

    public void find_ROI() {
        System.out.println("The ROI of ICICI bank is " + ROI);
    }
}

class BOI extends Bank {
    public BOI(double ROI) {
        super(ROI);
    }

    public void find_ROI() {
        System.out.println("The ROI of BOI bank is " + ROI);
    }
}

public class q5 {
    public static void main(String[] args) {
        Bank bank1 = new HDFC(5.5);
        Bank bank2 = new ICICI(6.0);
        Bank bank3 = new BOI(4.5);

        bank1.find_ROI();
        bank2.find_ROI();
        bank3.find_ROI();
    }
}
