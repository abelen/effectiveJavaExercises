package generic.methods;

import java.util.HashSet;
import java.util.Set;

/**
 * Partial Generic Set implementation.
 */
public class GenericSet<E> {

    public static <E>Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("bla");
        s1.add("saturn");

        Set<String> s2 = new HashSet<String>();
        s2.add("here");
        s2.add("ps3");

        for (String s: union(s1,s2)) {
            System.out.println(s);
        }
    }
}
