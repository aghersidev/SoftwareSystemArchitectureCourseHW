package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the DisposeDrink action.
 */
public abstract class DisposeDrink {
    protected DataStore dataStore;

    public DisposeDrink(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void disposeDrink(int d);
}
