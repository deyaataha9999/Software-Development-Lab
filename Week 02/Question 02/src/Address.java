public class Address {
    private String street;
    private String city;
    private String country;

    // Default constructor
    Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
