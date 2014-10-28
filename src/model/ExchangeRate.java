
package model;


public class ExchangeRate {
    private final Currency in;
    private final Currency out;
    private final double value;

    public ExchangeRate(Currency in, Currency out, double value) {
        this.in = in;
        this.out = out;
        this.value = value;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getValue() {
        return value;
    }
}
