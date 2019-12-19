package headfirst.designpatterns.c9.iterator.dinermergeri;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
