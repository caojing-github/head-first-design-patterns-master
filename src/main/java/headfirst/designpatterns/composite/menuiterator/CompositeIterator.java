package headfirst.designpatterns.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            // peek()函数返回栈顶的元素，但不弹出该栈顶元素。
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            // peek()函数返回栈顶的元素，但不弹出该栈顶元素。
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                // pop()函数返回栈顶的元素，并且将该栈顶元素出栈。
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
	
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


