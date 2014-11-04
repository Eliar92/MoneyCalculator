/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistency;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

/**
 *
 * @author usuario
 */
public class ExchangeRateLoader {
    private final Exchange exchange;
    private final CurrencySet currencySet;
    public ExchangeRateLoader(Exchange exchange, CurrencySet currencySet) {
        this.exchange=exchange;
        this.currencySet=currencySet;
    }

    public ExchangeRate load() {
        return new ExchangeRate(exchange.getCurrency(),currencySet.getCurrency("USA"),exchange.getMoney().getAmount(), (float) 0.8);
    }
    
}
