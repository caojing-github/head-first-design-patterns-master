package headfirst.designpatterns.c3.decorator.starbuzzWithSizes;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

