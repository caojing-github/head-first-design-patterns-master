package headfirst.designpatterns.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {

    /**
     * 名称
     */
    String name;

    /**
     * 面团类型
     */
    String dough;

    /**
     * 酱料类型
     */
    String sauce;

    /**
     * 一套佐料
     */
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

 
 
