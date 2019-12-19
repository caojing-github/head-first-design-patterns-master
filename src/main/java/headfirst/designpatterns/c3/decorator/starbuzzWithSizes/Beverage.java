package headfirst.designpatterns.c3.decorator.starbuzzWithSizes;

public abstract class Beverage {

    /**
     * 咖啡容量大小
     */
    public enum Size {

        /**
         * 小杯
         */
        TALL,

        /**
         * 中杯
         */
        GRANDE,

        /**
         * 大杯
         */
        VENTI
    }

    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
