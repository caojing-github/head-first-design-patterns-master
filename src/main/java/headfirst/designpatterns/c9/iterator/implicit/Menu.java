package headfirst.designpatterns.c9.iterator.implicit;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
