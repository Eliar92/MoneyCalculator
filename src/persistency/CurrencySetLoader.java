package persistency;

import java.io.File;
import model.CurrencySet;

public class CurrencySetLoader {
    private final CurrencySet currencySet;

    public CurrencySetLoader() {
        currencySet=null;
    }



    


    public CurrencySet load(File file){
        currencySet.add(null);
        return currencySet;
    }
}