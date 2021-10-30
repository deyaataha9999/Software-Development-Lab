public class Subject {
    private String name;
    private int id;
    private int hours;

    // Default constructor
    Subject(String name, int id, int hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
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

    public int getHours() {
        return hours;
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

    public void setHours(int hours) {
        this.hours = hours;
    }
}
