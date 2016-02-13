package strategy;

/**
 * Comparator that compares string lengths. From Joshua Bloch's Effective Java.
 */
public class StringLengthComparator implements Comparator<String>{

    /**
     * A singleton instance of this comparator.
     */
    private static StringLengthComparator INSTANCE = new StringLengthComparator();

    private StringLengthComparator() {
        // do nothing
    }

    /**
     * Returns an instance of this comparator.
     *
     * @return an instance of the comparator
     */
    public StringLengthComparator getInstance() {
        return INSTANCE;
    }

    /**
     * Returns the comparison value between s1 and s2.
     *
     * @param s1 the 1st string
     * @param s2 the 2nd string
     * @return
     */
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
