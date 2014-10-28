package userinterface;

import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {
    private final CurrencySet currencySet;
    private final Money money;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
        this.money = null;
    }

    public Exchange execute() {
        return null;
    }
    
}
