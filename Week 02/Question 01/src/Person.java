public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    // Default Constructor - Only name will be used later, the others are optional
    public Person(String name) {
        this.name = name;
    }

    // Initialize all the data fields
    public Person(String name, String address, String phone, String email) {
        this(name);
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // No need to rewrite it for each class as all of them will inherit this method
    @Override
    public String toString() {
        return "Class name is (" + this.getClass().getName() + ") and person's name is (" + getName() + ").";
    }
}
