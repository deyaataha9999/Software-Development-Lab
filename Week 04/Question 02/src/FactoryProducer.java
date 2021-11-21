public class FactoryProducer {
    // Private constructor to prevent users from creating instances of this class
    private FactoryProducer() {
    }

    public static AbstractFactory getFactory(String department) {
        if (department.equalsIgnoreCase("CS")) {
            return new CSStaffFactory();
        } else if (department.equalsIgnoreCase("IS")) {
            return new ISStaffFactory();
        } else if (department.equalsIgnoreCase("IT")) {
            return new ITStaffFactory();
        } else {
            return null;
        }
    }
}
