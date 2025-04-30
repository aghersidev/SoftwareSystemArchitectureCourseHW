package org.aghersi.AbstractFactoryPattern;

import org.aghersi.StrategyPattern.*;
import org.aghersi.VendingMachines.DataStore;

/**
 * Abstract Factory interface.
 */
public abstract class AbstractFactory {
    public abstract DataStore createDataStore();

    public abstract StorePrice createStorePrice();

    public abstract ZeroCF createZeroCF();

    public abstract IncreaseCF createIncreaseCF();

    public abstract ReturnCoins createReturnCoins();

    public abstract DisposeDrink createDisposeDrink();

    public abstract DisposeAdditive createDisposeAdditive();
}
