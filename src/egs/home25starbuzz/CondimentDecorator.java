package egs.home25starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected   Beverage beverage;
    public abstract String getDescription();


    public SizeCoffee getSizeCoffee() {
        return beverage.getSize();
    }
}
