public class Employee extends Person {
    private int salary;
    private int office;
    private MyDate dateHired;

    // Default Constructor
    Employee(String name) {
        super(name);
    }

    // Full constructor
    Employee(String name, int salary, int office, int day, int month, int year) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = new MyDate(day, month, year);
    }

    /*
     *
     * Accessor methods
     *
     */

    public int getSalary() {
        return salary;
    }

    public int getOffice() {
        return office;
    }

    public String getDateHired() {
        return dateHired.getDate();
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setDateHired(int day, int month, int year) {
        this.dateHired.setDate(day, month, year);
    }
}
