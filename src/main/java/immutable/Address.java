package immutable;

/**
 * Immutable street address.
 */
public final class Address {

    /**
     * Default constructor to build the address.
     */
    public Address(int streetNumber, String street, String city, String state, int zipCode) {

        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

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


    // the get methods should return a copy, not the actual instance.

    /**
     * Returns the street number.
     *
     * @return the street number
     */
    public int getStreetNumber() {
        return streetNumber;
    }

    /**
     * Returns the street
     *
     * @return the street name
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the state
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Returns the zip code
     *
     * @return the zip code
     */
    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return streetNumber + " " + street + " " + city + " " + state + " " + zipCode;
    }
}