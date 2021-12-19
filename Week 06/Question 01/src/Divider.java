import java.math.BigDecimal;

public class Divider implements DivideInterface {
    private BigDecimal dividendNumerator;

    // Constructor
    Divider(BigDecimal dividendNumerator) {
        this.dividendNumerator = dividendNumerator;
    }

    public BigDecimal calculate(BigDecimal value, String operation) {
        switch (operation.toLowerCase()) {
            case "divide":
                return this.divide(value); // value is a divisorDenominator
            case "multiply":
                DividerAdapter dividerAdapter = new DividerAdapter(dividendNumerator);
                return dividerAdapter.multiply(value); // value is a multiplicandFactor
            default:
                System.out.println("ERROR: Unsupported operation. Null is returned.");
                return null;
        }
    }

    @Override
    public BigDecimal divide(BigDecimal divisorDenominator) {
        return this.dividendNumerator.divide(divisorDenominator);
    }
}
