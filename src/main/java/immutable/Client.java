package immutable;

/**
 * Client class that creates immutable address.
 */
public class Client {

    public static void main(String[] args) {
        Address address = AddressBuilder.INSTANCE.buildAddress();
        System.out.println(address);

    }
}
