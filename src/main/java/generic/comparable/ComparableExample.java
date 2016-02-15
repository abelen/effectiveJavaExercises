package generic.comparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Comparable example.
 */
public class ComparableExample {

    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        // we are assuming a non empty list.
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(10);
        System.out.println(max(integers));
    }
}