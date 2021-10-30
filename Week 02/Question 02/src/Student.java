public class Student {
    private String name;
    private int id;
    private double gpa;
    private Subject subject;
    private Address address;

    // Default constructor
    Student(String name) {
        this.name = name;
    }

    // Full constructor
    Student(String name, int id, double gpa, Subject subject, Address address) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.subject = subject;
        this.address = address;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String getSubject() {
        return "Name(" + subject.getName() + ") " + "ID(" + subject.getId() + ") " + "Hours(" + subject.getHours()
                + ")";
    }

    public String getAddress() {
        return "Street(" + address.getStreet() + ") " + "City(" + address.getCity() + ") " + "Country("
                + address.getCountry() + ")";
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSubject(String name, int id, int hours) {
        this.subject.setName(name);
        this.subject.setId(id);
        this.subject.setHours(hours);
    }

    public void setAddress(String street, String city, String country) {
        this.address.setStreet(street);
        this.address.setCity(city);
        this.address.setCountry(country);
    }
}
