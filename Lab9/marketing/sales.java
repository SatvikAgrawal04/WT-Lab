package Lab9.marketing;

public class sales extends Lab9.General.employee{
    public void tallowance(){
        super.getData();
        double allowance = (0.5) * earning();
        System.out.println("Employee ID: " + super.empid);
        System.out.println("Total Allowance is: " + allowance);
    }
}
