package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class ReturnCoins1 extends ReturnCoins {
    public ReturnCoins1(DS1 ds) {
        super(ds);
    }

    @Override
    public void returnCoins() {
        DS1 ds1 = (DS1) dataStore;
        System.out.println("VM1: Returning coins: " + ds1.getCf());
    }
}
