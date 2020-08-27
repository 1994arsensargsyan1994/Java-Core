package egs.home25starbuzz;

public abstract class Beverage {
    protected String description = "unknown beverage";
    SizeCoffee size = SizeCoffee.TALL;

    public String getDescription() {
        return description;
    }


    public abstract double cost();

    public SizeCoffee getSize() {
        return size;
    }

    public void setSizeCoffee(SizeCoffee sizeCoffee) {
        this.size = sizeCoffee;
    }
}
