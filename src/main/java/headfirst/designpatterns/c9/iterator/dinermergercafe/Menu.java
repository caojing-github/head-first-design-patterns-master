package headfirst.designpatterns.c9.iterator.dinermergercafe;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
