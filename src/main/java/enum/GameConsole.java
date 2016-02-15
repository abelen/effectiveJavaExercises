import java.util.HashMap;
import java.util.Map;

/**
 * GameConsole enum.
 */
public enum GameConsole {
    NES(1985),
    SNES(1991),
    GENESIS(1989);

    // declare instance fields and writing a constructor that takes the data and stores it in the fields.

    /**
     * The year of the console.
     */
    private final int year;

    /**
     * String to GameConsole enum map.
     */
    private static final Map<String, GameConsole> stringToEnumMap = new HashMap<String, GameConsole>();

    /**
     * Initialize the map.
     */
    static {
        for (GameConsole gameConsole : values()) {
            stringToEnumMap.put(gameConsole.toString(), gameConsole);
        }
    }

    /**
     * Private constructor.
     *
     * @param year the year of the console
     */
    private GameConsole(int year) {
        this.year = year;
    }

    /**
     * Returns the enum value for the given string.
     *
     * @param value the enum value
     * @return the GameConsole enum or null if the enum doesn't exist for the value
     */
    public static GameConsole fromString(String value) {
        return stringToEnumMap.get(value);
    }
}