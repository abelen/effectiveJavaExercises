package generic.singleton;

import java.util.Map;

/**
 * Client implementation.
 */
public class Client {

    public static void main(String[] args) {
        // the advantage of this is that the fact you can hide the implementation of the map.
        Map<Integer, String> map = MapFactory.newHashMap();
        map.put(13, "ok");
        System.out.println(map.get(13));
    }
}