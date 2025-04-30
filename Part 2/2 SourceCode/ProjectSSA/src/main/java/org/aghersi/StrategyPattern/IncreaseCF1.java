package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class IncreaseCF1 extends IncreaseCF {
    public IncreaseCF1(DS1 ds) {
        super(ds);
    }

    @Override
    public void increaseCF() {
        DS1 ds1 = (DS1) dataStore;
        float newCf = ds1.getCf() + ds1.getTemp_v();
        ds1.setCf(newCf);
        System.out.println("VM1: Cumulative Fund increased to: " + ds1.getCf());
    }
}
