package EndSemPractice;

class Money{
    int paisa,rupee;
    Money(int x,int y){
        if((x<0 && y>0) || (x>0 && y<0)){
            System.out.println("Invalid values");
        }
        else{
            int z=0;
            if(x>=100){
                z=x/100;
                x=x%100;
            }
            paisa=x;
            rupee=y+z;
        }
    }
    Money(Money m){
        paisa=m.paisa;
        rupee=m.rupee;
    }
    Money add(Money M1){
        Money M2=new Money(0, 0);
        M2.paisa=paisa+M1.paisa;
        M2.rupee=rupee+M1.rupee;
        if(M2.paisa>=100){
            M2.rupee+=M2.paisa/100;
            M2.paisa=M2.paisa%100;
        }
        return M2;
    }
    Money subtract(Money M1){
        Money M2=new Money(0, 0);;
        if(paisa<M1.paisa){
            paisa+=100;
            rupee--;
        }
        M2.paisa=paisa-M1.paisa;
        M2.rupee=rupee-M1.rupee;
        return M2;
    }
}
public class q1 {
    public static void main(String args[]){
        Money m1=new Money(580, 120);
        Money m2=new Money(120, 238);
        System.out.println(m1.rupee + '.' + m1.paisa);
        System.out.println(m2.rupee + '.' + m2.paisa);
//        Money m3=new Money(m1.add(m2));
//        System.out.println("Addition result: paisa="+m3.paisa+" rupee="+m3.rupee);
//        Money m4=new Money(m1.subtract(m2));
//        System.out.println("Subtraction result: paisa="+m4.paisa+" rupee="+m4.rupee);
    }
}