package EndSemPractice.Calculator;

public class Number {
    int value;
    public Number(int x){
        value = x;
    }
    public double findSquare(){
        return Math.pow(value, 2);
    }
}
