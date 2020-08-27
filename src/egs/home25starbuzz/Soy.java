package egs.home25starbuzz;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost =beverage.cost();
        if (beverage.getSize() == SizeCoffee.TALL) {
            cost += .10;
        } else if (beverage.getSize() == SizeCoffee.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == SizeCoffee.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
