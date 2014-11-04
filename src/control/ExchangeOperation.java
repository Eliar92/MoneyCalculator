
package control;

import model.CurrencySet;
import persistency.ExchangeRateLoader;
import process.Exchanger;
import userinterface.ExchangeDialog;
import userinterface.MoneyDisplay;


public class ExchangeOperation {
    CurrencySet currencySet;
    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet=currencySet;
    }
    
   
    public void execute(){
        ExchangeDialog exchangeDialog=new ExchangeDialog(currencySet);
        ExchangeRateLoader rateLoader=new ExchangeRateLoader(exchangeDialog.getExchange(),currencySet);
        Exchanger exchanger=new Exchanger(rateLoader.load());
        MoneyDisplay moneydisplay=new MoneyDisplay(exchanger.exchange());
    }
}
