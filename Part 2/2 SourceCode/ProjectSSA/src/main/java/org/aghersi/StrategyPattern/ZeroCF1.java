package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class ZeroCF1 extends ZeroCF {
    public ZeroCF1(DS1 ds) {
        super(ds);
    }

    @Override
    public void zeroCF() {
        DS1 ds1 = (DS1) dataStore;
        ds1.setCf(0.0f);
        System.out.println("VM1: Cumulative Fund reset to 0.0");
    }
}
