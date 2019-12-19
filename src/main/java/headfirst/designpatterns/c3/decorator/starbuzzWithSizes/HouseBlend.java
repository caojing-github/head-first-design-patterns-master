package headfirst.designpatterns.c3.decorator.starbuzzWithSizes;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

