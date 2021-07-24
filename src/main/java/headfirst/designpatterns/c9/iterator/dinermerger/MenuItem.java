package headfirst.designpatterns.c9.iterator.dinermerger;

/**
 * 菜单项
 */
public class MenuItem {

    /**
     * 名称
     */
    String name;

    /**
     * 叙述
     */
    String description;

    /**
     * 是否为素食
     */
    boolean vegetarian;

    /**
     * 价格
     */
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
