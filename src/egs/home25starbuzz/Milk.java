package egs.home25starbuzz;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double cost =beverage.cost();
        if (beverage.getSize() == SizeCoffee.TALL) {
            cost += .12;
        } else if (beverage.getSize() == SizeCoffee.GRANDE) {
            cost += .18;
        } else if (beverage.getSize() == SizeCoffee.VENTI) {
            cost += .25;
        }
        return cost;
    }
}
