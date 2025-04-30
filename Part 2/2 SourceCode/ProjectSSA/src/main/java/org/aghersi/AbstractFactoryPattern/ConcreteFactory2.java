package org.aghersi.AbstractFactoryPattern;

import org.aghersi.StrategyPattern.*;
import org.aghersi.VendingMachines.DS2;
import org.aghersi.VendingMachines.DataStore;

/**
 * Concrete Factory for Vending Machine 2.
 */
public class ConcreteFactory2 extends AbstractFactory {
    private DS2 ds2 = new DS2();

    @Override
    public DataStore createDataStore() {
        return ds2;
    }

    @Override
    public StorePrice createStorePrice() {
        return new StorePrice2(ds2);
    }

    @Override
    public ZeroCF createZeroCF() {
        return new ZeroCF2(ds2);
    }

    @Override
    public IncreaseCF createIncreaseCF() {
        return new IncreaseCF2(ds2);
    }

    @Override
    public ReturnCoins createReturnCoins() {
        return new ReturnCoins2(ds2);
    }

    @Override
    public DisposeDrink createDisposeDrink() {
        return new DisposeDrink2(ds2);
    }

    @Override
    public DisposeAdditive createDisposeAdditive() {
        return new DisposeAdditive2(ds2);
    }
}
