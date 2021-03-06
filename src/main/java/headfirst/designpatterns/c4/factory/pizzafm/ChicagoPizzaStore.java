package headfirst.designpatterns.c4.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        // 芝士
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
