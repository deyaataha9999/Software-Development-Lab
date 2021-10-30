public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    // Default constructor
    Faculty(String name) {
        super(name);
    }

    // Full constructor
    Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
