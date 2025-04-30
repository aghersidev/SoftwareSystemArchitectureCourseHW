package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class ZeroCF2 extends ZeroCF {
    public ZeroCF2(DS2 ds) {
        super(ds);
    }

    @Override
    public void zeroCF() {
        DS2 ds2 = (DS2) dataStore;
        ds2.setCf(0);
        System.out.println("VM2: Cumulative Fund reset to 0");
    }
}
