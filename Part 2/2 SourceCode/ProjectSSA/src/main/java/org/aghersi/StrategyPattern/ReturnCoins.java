package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the ReturnCoins action.
 */
public abstract class ReturnCoins {
    protected DataStore dataStore;

    public ReturnCoins(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void returnCoins();
}
