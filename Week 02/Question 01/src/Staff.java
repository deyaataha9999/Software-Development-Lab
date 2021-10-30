public class Staff extends Employee {
    private String title;

    // Default constructor
    Staff(String name) {
        super(name);
    }

    // Full constructor
    Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getTitle() {
        return title;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setTitle(String title) {
        this.title = title;
    }
}
