package headfirst.designpatterns.decorator.starbuzz;

/**
 * 调料装饰者
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
