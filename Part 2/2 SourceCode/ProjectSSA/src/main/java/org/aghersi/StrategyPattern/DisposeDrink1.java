package org.aghersi.StrategyPattern;

import org.aghersi.VendingMachines.DS1;

public class DisposeDrink1 extends DisposeDrink {
    public DisposeDrink1(DS1 ds) {
        super(ds);
    }

    @Override
    public void disposeDrink(int d) {
        String drinkName = "";
        switch (d) {
            case 1:
                drinkName = "Cappuccino";
                break;
            case 2:
                drinkName = "Chocolate";
                break;
            default:
                drinkName = "Unknown Drink ID " + d;
                break;
        }
        System.out.println("VM1: Disposing drink: " + drinkName);
    }
}
