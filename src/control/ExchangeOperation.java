
package control;

import model.CurrencySet;
import model.Exchange;
import model.Money;
import persistency.ExchangeRateLoader;
import process.Exchanger;
import userinterface.ExchangeDialog;
import userinterface.MoneyDisplay;


public class ExchangeOperation {

    public ExchangeOperation() {
    }
    
    public void execute(CurrencySet currencySet){
        ExchangeDialog exchangeDialog=new ExchangeDialog(currencySet);
        Exchange exchange;
        exchange=exchangeDialog.execute();
        Money money=new Money(200,null);
        ExchangeRateLoader rateLoader=new ExchangeRateLoader(exchange,money);
        rateLoader.load();
        Exchanger exchanger=new Exchanger();
        exchanger.exchange();
        MoneyDisplay moneydisplay=new MoneyDisplay();
    }
}
