public class ISStaffFactory implements AbstractFactory {
    @Override
    public Staff getStaff(String staffType) {
        if (staffType.equalsIgnoreCase("Doctor")) {
            return new ISDoctor();
        } else if (staffType.equalsIgnoreCase("TeachingAssistant")) {
            return new ISTeachingAssistant();
        } else {
            return null;
        }
    }
}
