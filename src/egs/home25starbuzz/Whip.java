package egs.home25starbuzz;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double cost =beverage.cost();
        if (beverage.getSize() == SizeCoffee.TALL) {
            cost += .15;
        } else if (beverage.getSize() == SizeCoffee.GRANDE) {
            cost += .20;
        } else if (beverage.getSize() == SizeCoffee.VENTI) {
            cost += .23;
        }
        return cost;
    }
}
