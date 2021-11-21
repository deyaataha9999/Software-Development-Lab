public class StaffFactory {
    public Staff getStaff(String staffType) {
        if (staffType.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        } else if (staffType.equalsIgnoreCase("TeachingAssistant")) {
            return new TeachingAssistant();
        } else {
            return null;
        }
    }
}
