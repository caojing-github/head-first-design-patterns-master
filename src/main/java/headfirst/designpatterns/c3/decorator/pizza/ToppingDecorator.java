package headfirst.designpatterns.c3.decorator.pizza;

public abstract class ToppingDecorator extends Pizza {
    Pizza pizza;

    @Override
    public abstract String getDescription();
}
