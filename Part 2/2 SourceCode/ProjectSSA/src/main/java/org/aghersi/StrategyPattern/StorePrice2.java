package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class StorePrice2 extends StorePrice {
    public StorePrice2(DS2 ds) {
        super(ds);
    }

    @Override
    public void storePrice() {
        DS2 ds2 = (DS2) dataStore;
        ds2.setPrice(ds2.getTemp_p());
        System.out.println("VM2: Price stored: " + ds2.getPrice());
    }
}
