package generic.stack;

import java.util.EmptyStackException;

/**
 * A stack implementation using generics
 */
public class GenericStack<E> {

    private E[] elements;

    private int size = 0;

    private static final int DEFAULT_INITAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_INITAL_CAPACITY];
    }

    public void push(E e) {
        //ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }
}