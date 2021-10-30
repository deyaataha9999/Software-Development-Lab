public class App {
    public static void main(String[] args) {
        Student s = new Student("Alice", 1, 3.5, new Subject("OOP", 211, 3), new Address("412-210", "Minya", "Egypt"));

        System.out.println();
        System.out.println("- Student data before editing -");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("GPA: " + s.getGpa());
        System.out.println("Subject: " + s.getSubject());
        System.out.println("Address: " + s.getAddress());

        s.setName("Bob");
        s.setId(2);
        s.setGpa(3.7);
        s.setSubject("DSA", 212, 3);
        s.setAddress("847-652", "Cairo", "Egypt");

        System.out.println();
        System.out.println("- Student data after editing -");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("GPA: " + s.getGpa());
        System.out.println("Subject: " + s.getSubject());
        System.out.println("Address: " + s.getAddress());
    }
}
