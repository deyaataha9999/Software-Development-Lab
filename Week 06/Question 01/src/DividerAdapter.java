import java.math.BigDecimal;

public class DividerAdapter implements DivideInterface {
    private Multiplier multiplier;

    // Use Dividend numerator from divider as multiplier factor for multiplier class
    public DividerAdapter(BigDecimal dividendAsMultiplier) {
        this.multiplier = new Multiplier(dividendAsMultiplier);
    }

    @Override
    public BigDecimal divide(BigDecimal divisorDenominator) {
        return null;
    }

    // Use this method to multiply numbers using divider
    public BigDecimal multiply(BigDecimal multiplicandFactor) {
        return multiplier.multiply(multiplicandFactor);
    }
}
