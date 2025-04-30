package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class DisposeAdditive2 extends DisposeAdditive {
    public DisposeAdditive2(DS2 ds) {
        super(ds);
    }

    @Override
    public void disposeAdditive(int[] A) {
        // VM2 Additive IDs: 1 = Cream, 2 = Sugar
        System.out.print("VM2: Disposing additives: ");
        boolean nothing = true;
        if (A.length > 1 && A[1] == 1) { // Check index 1 for Cream
            System.out.print("Cream ");
            nothing = false;
        }
        if (A.length > 2 && A[2] == 1) { // Check index 2 for Sugar
            System.out.print("Sugar ");
            nothing = false;
        }
        if (nothing) {
            System.out.print("None");
        }
        System.out.println();
    }
}
