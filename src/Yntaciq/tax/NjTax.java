package Yntaciq.tax;

public class NjTax extends  Tax {
    public NjTax(double grossIncome, String state, int dependents) {
        super(grossIncome, state, dependents);
    }

    public NjTax() {
    }

    public double adjustforstudents(double tax){

        return   tax - 500;
    }

    @Override
    public double calcTax(){
        if (grossIncome < 50000){
            return grossIncome * 0.10;
        }else
            return grossIncome * 0.13;
    }
}
