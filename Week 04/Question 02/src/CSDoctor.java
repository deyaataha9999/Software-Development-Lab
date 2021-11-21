public class CSDoctor implements Staff {
    private double salary;
    private int yearsOfWork;

    /*
     *
     * Accessor methods
     *
     */

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getYearsOfWork() {
        return yearsOfWork;
    }

    /*
     *
     * Mutator methods
     *
     */

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setYearsOfWork(int yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }
}
