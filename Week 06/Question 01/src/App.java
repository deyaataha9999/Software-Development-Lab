import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        // Will use a divider to multiply two numbers
        Divider m = new Divider(new BigDecimal("50"));

        // Should print 100 (50 * 2 => 100)
        System.out.println(m.calculate(new BigDecimal(2), "multiply"));

        // Should print 25 (50 / 2 => 25)
        System.out.println(m.calculate(new BigDecimal(2), "divide"));

        // Should print error message
        System.out.println(m.calculate(new BigDecimal(2), "add"));
    }
}
