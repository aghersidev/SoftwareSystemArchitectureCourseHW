package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the IncreaseCF action.
 */
public abstract class IncreaseCF {
    protected DataStore dataStore;

    public IncreaseCF(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void increaseCF();
}
