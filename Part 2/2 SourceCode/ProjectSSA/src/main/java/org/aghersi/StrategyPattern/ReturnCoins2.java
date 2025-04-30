package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class ReturnCoins2 extends ReturnCoins {
    public ReturnCoins2(DS2 ds) {
        super(ds);
    }

    @Override
    public void returnCoins() {
        DS2 ds2 = (DS2) dataStore;
        System.out.println("VM2: Returning coins: " + ds2.getCf());
    }
}
