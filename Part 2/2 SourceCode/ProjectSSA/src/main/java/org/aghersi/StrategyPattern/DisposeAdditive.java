package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract class for the DisposeAdditive action.
 */
public abstract class DisposeAdditive {
    protected DataStore dataStore;

    public DisposeAdditive(DataStore ds) {
        this.dataStore = ds;
    }

    public abstract void disposeAdditive(int[] A);
}
