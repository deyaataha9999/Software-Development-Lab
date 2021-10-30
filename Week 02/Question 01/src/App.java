public class App {
    public static void main(String[] args) {
        // Test class
        Person a = new Person("Alice");
        System.out.println(a.toString());

        Student b = new Student("Bob", Student.STATUS_FRESHMAN);
        System.out.println(b.toString());

        Employee c = new Employee("Charlie");
        System.out.println(c.toString());

        Faculty d = new Faculty("Dave");
        System.out.println(d.toString());

        Staff e = new Staff("Eve");
        System.out.println(e.toString());
    }
}
