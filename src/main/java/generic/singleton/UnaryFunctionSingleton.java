package generic.singleton;

/**
 * Unary Function that tests out the singleton pattern. From Josh Bloch's Effective Java
 */
// implementation may not be correct.
public class UnaryFunctionSingleton<T> implements UnaryFunction<T> {

    @SuppressWarnings("unchecked")
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction() {
        public Object apply(Object arg) {
            return arg;
        }
    };

    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    public T apply(T arg) {
        return null;
    }

    public static void main(String[] args) {
        String[] strings = {"jute", "hemp", "nylon"};

        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }
    }
}