package egs.home25starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }

}
