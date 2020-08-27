package egs.home25starbuzz;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost =beverage.cost();
        if (beverage.getSize() == SizeCoffee.TALL) {
            cost += .8;
        } else if (beverage.getSize() == SizeCoffee.GRANDE) {
            cost += .13;
        } else if (beverage.getSize() == SizeCoffee.VENTI) {
            cost += .18;
        }
        return cost;
    }
}
