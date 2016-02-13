package generic.stack;

/**
 * Client stack implementation.
 */
public class Client {

    public static void main(String[] args) {
        GenericStack<String> stringGenericStack = new GenericStack<String>();

        stringGenericStack.push("bob");

        System.out.println(stringGenericStack.pop());


    }
}
