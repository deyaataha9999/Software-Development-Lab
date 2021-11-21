public class CSStaffFactory implements AbstractFactory {
    @Override
    public Staff getStaff(String staffType) {
        if (staffType.equalsIgnoreCase("Doctor")) {
            return new CSDoctor();
        } else if (staffType.equalsIgnoreCase("TeachingAssistant")) {
            return new CSTeachingAssistant();
        } else {
            return null;
        }
    }
}
