package lab7;

import java.util.Scanner;

class shapes{
    int total;
    int sheetCost;
    int boxCost;
    int sheetDim;
    int boxDim;
    shapes(){
        sheetCost = 40;
        boxCost = 60;
    }
    void getSheetDimension(){
        System.out.print("Enter Quantity in sq. ft: ");
        Scanner s = new Scanner(System.in);
        sheetDim = s.nextInt();
    }
    void getBoxDimension(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter quantity in cubic ft: ");
        boxDim = s.nextInt();
    }
    void getTotal(){
        total = (sheetCost * sheetDim) + (boxCost * boxDim);
        System.out.println("Total cost is: " + total);
    }
}


public class q3 {
    public static void main(String[] args) {
        shapes obj1 = new shapes();

        obj1.getSheetDimension();
        obj1.getBoxDimension();
        obj1.getTotal();
    }

}
