
package application;

import control.ExchangeOperation;
import persistency.CurrencySetLoader;

public class MoneyCalculator {

    public static void main(String[] args) {
        CurrencySetLoader currencySetLoader=new CurrencySetLoader();
        ExchangeOperation operation=new ExchangeOperation(currencySetLoader.load());
        operation.execute();
    }
    
}
