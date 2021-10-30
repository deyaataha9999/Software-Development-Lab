public class MyDate {
    private int day;
    private int month;
    private int year;

    // Default constructor
    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /*
     *
     * Accessor methods
     *
     */

    public String getDate() {
        return day + "/" + month + "/" + year;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
