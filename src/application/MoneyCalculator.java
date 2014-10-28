
package application;

import control.ExchangeOperation;
import model.CurrencySet;
import persistency.CurrencySetLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader=new CurrencySetLoader();
        CurrencySet currencySet;
        currencySet=currencySetLoader.load(null);
        ExchangeOperation operation=new ExchangeOperation();
        operation.execute(currencySet);
    }
    
}
