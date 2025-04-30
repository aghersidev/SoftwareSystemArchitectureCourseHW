package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class DisposeAdditive1 extends DisposeAdditive {
    public DisposeAdditive1(DS1 ds) {
        super(ds);
    }

    @Override
    public void disposeAdditive(int[] A) {
        // VM1 Additive IDs: 1 = sugar
        System.out.print("VM1: Disposing additives: ");
        boolean nothing = true;
        if (A.length > 1 && A[1] == 1) { // Check index 1 for sugar
            System.out.print("Sugar ");
            nothing = false;
        }
        if (nothing) {
            System.out.print("None");
        }
        System.out.println();
    }
}
