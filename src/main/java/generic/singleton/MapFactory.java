package generic.singleton;

import java.util.HashMap;

/**
 * Factory class that is used to create generic maps.
 */
public final class MapFactory {

    /**
     * Disallows instantiation.
     */
    private MapFactory() {
        // do nothing
    }

    /**
     * Creates a new hash map with the given types.
     *
     * @param <K> the key
     * @param <V> the value
     * @return a new {@link HashMap}
     */
    public static <K,V> HashMap<K,V> newHashMap() {
        return new HashMap<K, V>();
    }
}