package model;

import java.util.HashMap;
//import java.util.Iterator;



public class CurrencySet {
    private final HashMap<Integer,Currency> currencySet;

    public CurrencySet(HashMap<Integer,Currency> currencySet) {
        this.currencySet = currencySet;
    }

    /*public void iterator(Iterator i){
        for (CurrencySet currencySet : i) {
            
        }
    }
    public void add(Currency currency,int code){
        currencySet.put(code,currency);
    }*/

    public void add(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
