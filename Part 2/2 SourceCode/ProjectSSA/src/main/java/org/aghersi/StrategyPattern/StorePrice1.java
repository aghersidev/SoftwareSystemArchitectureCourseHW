package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class StorePrice1 extends StorePrice {
    public StorePrice1(DS1 ds) {
        super(ds);
    }

    @Override
    public void storePrice() {
        DS1 ds1 = (DS1) dataStore;
        ds1.setPrice(ds1.getTemp_p());
        System.out.println("VM1: Price stored: " + ds1.getPrice());
    }
}
