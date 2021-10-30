public class Student extends Person {
    // Constant status made public so user can invoke them into the constructor
    public static final String STATUS_FRESHMAN = "freshman";
    public static final String STATUS_SOPHOMORE = "sophomore";
    public static final String STATUS_JUNIOR = "junior";
    public static final String STATUS_SENIOR = "senior";

    // Status data field that describe the current student status
    private final String status;

    // Constructor
    Student(String name, String status) {
        super(name);
        this.status = status;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getStatus() {
        return status;
    }
}
