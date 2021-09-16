package be.vdab.garage;

import java.math.BigDecimal;

public class MetReservewiel extends AutoDecorator {
    public MetReservewiel(Auto gedecoreerdeAuto) {
        super(gedecoreerdeAuto);
    }

    @Override
    public BigDecimal getPrijs() {
        return gedecoreerdeAuto.getPrijs().add(BigDecimal.valueOf(250));
    }
}