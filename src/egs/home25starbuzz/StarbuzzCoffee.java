package egs.home25starbuzz;

import Test.testfive.B;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description+" $:"+beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $:"+beverage1.cost());
        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(new Whip(beverage2));
        beverage2.setSizeCoffee(SizeCoffee.VENTI);
        System.out.println("__________________________");
        System.out.println(beverage2.getDescription()+": "+beverage2.getSize()+" $:"+beverage2.cost());
    }
}
