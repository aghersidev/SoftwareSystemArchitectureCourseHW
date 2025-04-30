package org.aghersi.StatePattern;

import org.aghersi.AbstractFactoryPattern.AbstractFactory;
import org.aghersi.StrategyPattern.*;

/**
 * Output Processor. Executes the concrete operation methods.
 */
public class OutputProcessor {
    private StorePrice storePrice;
    private ZeroCF zeroCF;
    private IncreaseCF increaseCF;
    private ReturnCoins returnCoins;
    private DisposeDrink disposeDrink;
    private DisposeAdditive disposeAdditive;

    public OutputProcessor(AbstractFactory af) {
        this.storePrice = af.createStorePrice();
        this.zeroCF = af.createZeroCF();
        this.increaseCF = af.createIncreaseCF();
        this.returnCoins = af.createReturnCoins();
        this.disposeDrink = af.createDisposeDrink();
        this.disposeAdditive = af.createDisposeAdditive();
    }

    public void StorePrice() {
        storePrice.storePrice();
    }

    public void ZeroCF() {
        zeroCF.zeroCF();
    }

    public void IncreaseCF() {
        increaseCF.increaseCF();
    }

    public void ReturnCoins() {
        returnCoins.returnCoins();
    }

    public void DisposeDrink(int d) {
        disposeDrink.disposeDrink(d);
    }

    public void DisposeAdditive(int[] A) {
        disposeAdditive.disposeAdditive(A);
    }
}
