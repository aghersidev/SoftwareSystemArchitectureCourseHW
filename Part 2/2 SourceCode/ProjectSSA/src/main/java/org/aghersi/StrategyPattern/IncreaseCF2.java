package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class IncreaseCF2 extends IncreaseCF {
    public IncreaseCF2(DS2 ds) {
        super(ds);
    }

    @Override
    public void increaseCF() {
        DS2 ds2 = (DS2) dataStore;
        int newCf = ds2.getCf() + ds2.getTemp_v();
        ds2.setCf(newCf);
        System.out.println("VM2: Cumulative Fund increased to: " + ds2.getCf());
    }
}
