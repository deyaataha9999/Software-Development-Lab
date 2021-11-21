public class ITStaffFactory implements AbstractFactory {
    public Staff getStaff(String staffType) {
        if (staffType.equalsIgnoreCase("Doctor")) {
            return new ITDoctor();
        } else if (staffType.equalsIgnoreCase("TeachingAssistant")) {
            return new ITTeachingAssistant();
        } else {
            return null;
        }
    }
}
