package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the StorePrice action.
 */
public abstract class StorePrice {
    protected DataStore dataStore;

    public StorePrice(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void storePrice();
}
