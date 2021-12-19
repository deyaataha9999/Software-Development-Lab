import java.math.BigDecimal;

public class Multiplier implements MultiplyInterface {
    private BigDecimal multiplierFactor;

    // Constructor
    Multiplier(BigDecimal multiplierFactor) {
        this.multiplierFactor = multiplierFactor;
    }

    @Override
    public BigDecimal multiply(BigDecimal multiplicandFactor) {
        return this.multiplierFactor.multiply(multiplicandFactor);
    }
}
