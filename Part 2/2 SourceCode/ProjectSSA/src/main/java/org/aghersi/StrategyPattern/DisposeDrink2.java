package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS2;

public class DisposeDrink2 extends DisposeDrink {
    public DisposeDrink2(DS2 ds) {
        super(ds);
    }

    @Override
    public void disposeDrink(int d) {
        String drinkName = "";
        switch (d) {
            case 1:
                drinkName = "Coffee";
                break;
            default:
                drinkName = "Unknown Drink ID " + d;
                break;
        }
        System.out.println("VM2: Disposing drink: " + drinkName);
    }
}
