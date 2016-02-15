package generic.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

/**
 * Stack example.
 */
public class StackExample<E> {

    private Stack<E> stack;

    public StackExample() {
        stack = new Stack<E>();
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e: src) {
            stack.push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!stack.isEmpty()) {
            dst.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        stackExample.pushAll(integers);

        System.out.println(stackExample.stack);
        List<Integer> insertList = new ArrayList<Integer>();
        stackExample.popAll(insertList);
        System.out.println(insertList);
    }
}