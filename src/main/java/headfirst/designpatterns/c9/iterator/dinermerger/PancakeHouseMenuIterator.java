package headfirst.designpatterns.c9.iterator.dinermerger;

import java.util.ArrayList;

/**
 * 煎饼屋菜单迭代器
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }
}
