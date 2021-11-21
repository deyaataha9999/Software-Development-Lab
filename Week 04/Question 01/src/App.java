import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StaffFactory staffFactory = new StaffFactory();

        // Get staff type from user
        System.out.print("Enter the staff type: ");
        String staffType = input.nextLine();
        Staff staff = staffFactory.getStaff(staffType);

        // Terminate with error message if the user entered unsupported staff type
        if (staff == null) {
            System.err.println("ERROR: Unsupported staff type.");
            input.close();
            return;
        }

        // Set the staff salary
        System.out.print("Enter the staff salary: ");
        int salary = input.nextInt();
        staff.setSalary(salary);

        // Set the staff years of work
        System.out.print("Enter the staff years of work: ");
        int yearsOfWork = input.nextInt();
        staff.setYearsOfWork(yearsOfWork);

        // Close the Scanner
        input.close();

        // Print a summary about the class
        System.out.println("Summary:");
        System.out.println(staff.getClass().getName() + " salary: " + staff.getSalary());
        System.out.println(staff.getClass().getName() + " years of work: " + staff.getYearsOfWork());
    }
}
