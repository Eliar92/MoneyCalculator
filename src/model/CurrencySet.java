package model;

import java.util.HashMap;

public class CurrencySet {
    private final HashMap<String,Currency> currencySet;

    public CurrencySet(HashMap<String,Currency> currencySet) {
        this.currencySet = currencySet;
    }
    public Currency getCurrency(String key){
        return currencySet.get(key);
    }
}
