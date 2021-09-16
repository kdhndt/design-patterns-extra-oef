package be.vdab.garage;

import java.math.BigDecimal;

public class BarebonesAuto implements Auto {
    @Override
    public BigDecimal getPrijs() {
        return BigDecimal.valueOf(25_000);
    }
}
