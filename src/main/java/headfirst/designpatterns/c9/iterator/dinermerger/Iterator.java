package headfirst.designpatterns.c9.iterator.dinermerger;

/**
 * 迭代器
 */
@SuppressWarnings("all")
public interface Iterator {

    /**
     * 是否有更多的元素
     */
    boolean hasNext();

    /**
     * 集合的下一个元素
     */
    MenuItem next();
}
