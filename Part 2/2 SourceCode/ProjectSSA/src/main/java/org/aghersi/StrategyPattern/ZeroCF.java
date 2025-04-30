package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the ZeroCF action.
 */
public abstract class ZeroCF {
    protected DataStore dataStore;

    public ZeroCF(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void zeroCF();
}
