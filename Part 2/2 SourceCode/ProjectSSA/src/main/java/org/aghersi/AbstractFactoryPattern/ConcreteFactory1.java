package org.aghersi.AbstractFactoryPattern;

import org.aghersi.StrategyPattern.*;
import org.aghersi.VendingMachines.DS1;
import org.aghersi.VendingMachines.DataStore;

/**
 * Concrete Factory for Vending Machine 1.
 */
public class ConcreteFactory1 extends AbstractFactory {
    private DS1 ds1 = new DS1();

    @Override
    public DataStore createDataStore() {
        return ds1;
    }

    @Override
    public StorePrice createStorePrice() {
        return new StorePrice1(ds1);
    }

    @Override
    public ZeroCF createZeroCF() {
        return new ZeroCF1(ds1);
    }

    @Override
    public IncreaseCF createIncreaseCF() {
        return new IncreaseCF1(ds1);
    }

    @Override
    public ReturnCoins createReturnCoins() {
        return new ReturnCoins1(ds1);
    }

    @Override
    public DisposeDrink createDisposeDrink() {
        return new DisposeDrink1(ds1);
    }

    @Override
    public DisposeAdditive createDisposeAdditive() {
        return new DisposeAdditive1(ds1);
    }
}
