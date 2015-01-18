package persistency;

import model.Currency;
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
    private int rate;
    public ExchangeRateLoader(Exchange exchange, CurrencySet currencySet) {
        this.exchange=exchange;
        this.currencySet=currencySet;    
    }

   private double rate(Currency currency, Currency currency2){
        switch (currency.toString()){
            case "Euro": if (currency2.toString()=="Dolar") return 1.1;
                else if(currency2.toString()=="Libra") return 0.8;
            case "Dolar": if (currency2.toString()=="Euro") return 0.9;
                else if(currency2.toString()=="Libra") return 0.5;
            case "Libra": if (currency2.toString()=="Dolar") return 2;
                else if(currency2.toString()=="Euro") return 1.25;
            default: return 0;
        }
    }
    public ExchangeRate load() {
        
        return new ExchangeRate(exchange.getMoney().getCurrency(),exchange.getCurrency(),exchange.getMoney().getAmount(), (float) this.rate(exchange.getMoney().getCurrency(),exchange.getCurrency()));
    }
    
}
