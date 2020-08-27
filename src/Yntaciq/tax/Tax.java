package Yntaciq.tax;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state = state;
        this.dependents = dependents;
    }

    public Tax() {
    }

    public double calcTax(){
if (grossIncome < 50000){
    return grossIncome * 0.06;
}else
    return grossIncome * 0.08;
    }
}
