package immutable;

/**
 * A singleton builder class.
 */
public enum AddressBuilder {

    INSTANCE;

    private static final int DEFAULT_STREET_NUMBER = 1111;

    private static final String DEFAULT_STREET = "Elm St.";

    private static final String DEFAULT_CITY = "Baltimore";

    private static final String DEFAULT_STATE = "Maryland";

    private static final int DEFAULT_ZIP_CODE = 12345;

    /**
     * The street number.
     */
    private int streetNumber;

    /**
     * The street.
     */
    private String street;

    /**
     * The city
     */
    private String city;

    /**
     * The state.
     */
    private String state;

    /**
     * The zip code.
     */
    private int zipCode;

    /**
     * Sets the street number.
     *
     * @param streetNumber the street number
     * @return a reference to the builder
     */
    public AddressBuilder withStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;

        return this;
    }

    public AddressBuilder withStreet(String street) {
        this.street = street;

        return this;
    }

    public AddressBuilder withCity(String city) {
        this.city = city;

        return this;
    }

    public AddressBuilder withState(String state) {
        this.state = state;

        return this;
    }

    public AddressBuilder withZipCode(int zipCode) {
        this.zipCode = zipCode;

        return this;
    }

    public Address buildAddress() {
        return build();
    }

    private Address build() {
        if (streetNumber == 0) {
            streetNumber = DEFAULT_STREET_NUMBER;
        }

        if (street == null) {
            street = DEFAULT_STREET;
        }

        if (city == null) {
            city = DEFAULT_CITY;
        }

        if (state == null) {
            state = DEFAULT_STATE;
        }

        if (zipCode == 0) {
            zipCode = DEFAULT_ZIP_CODE;
        }

        return new Address(streetNumber,street,city, state, zipCode);
    }
}