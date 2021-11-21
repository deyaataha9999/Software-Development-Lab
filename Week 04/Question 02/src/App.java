public class App {
    public static void main(String[] args) {
        AbstractFactory staffFactory;
        Staff staff;

        // Test case for IS Doctor
        staffFactory = FactoryProducer.getFactory("IS");
        staff = staffFactory.getStaff("Doctor");
        staff.setSalary(3000);
        staff.setYearsOfWork(5);
        printSummary(staff, 1);
        System.out.println();

        // Test case for CS Teaching Assistant
        staffFactory = FactoryProducer.getFactory("CS");
        staff = staffFactory.getStaff("TeachingAssistant");
        staff.setSalary(4000);
        staff.setYearsOfWork(3);
        printSummary(staff, 2);
        System.out.println();

        // Test case for IT Doctor
        staffFactory = FactoryProducer.getFactory("IT");
        staff = staffFactory.getStaff("Doctor");
        staff.setSalary(5000);
        staff.setYearsOfWork(7);
        printSummary(staff, 3);
    }

    // Print a summary about the staff
    public static void printSummary(Staff staff, int staffNumber) {
        System.out.printf("Summary (%d):%n", staffNumber);
        System.out.println(staff.getClass().getName() + " salary: " + staff.getSalary());
        System.out.println(staff.getClass().getName() + " years of work: " + staff.getYearsOfWork());
    }
}
