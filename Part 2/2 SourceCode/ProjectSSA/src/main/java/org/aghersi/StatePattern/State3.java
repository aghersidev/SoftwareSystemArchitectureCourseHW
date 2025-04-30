package org.aghersi.StatePattern;

import org.aghersi.VendingMachines.EFSM;

import java.util.Arrays;

/**
 * State 3: Coins Inserted.
 */
public class State3 extends State {
    public State3(EFSM efsm, OutputProcessor op) {
        super(efsm, op);
    }

    @Override
    public void cancel() {
        op.ReturnCoins();
        op.ZeroCF();
        efsm.changeState(2);
    }

    @Override
    public void dispose_drink(int d) {
        if (efsm.getK() > 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(efsm.getA());
            efsm.setK(efsm.getK() - 1);
            op.ZeroCF();
            efsm.changeState(2);
        } else if (efsm.getK() == 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(efsm.getA());
            efsm.setK(0);
            efsm.changeState(1);
        } else {
            System.out.println("Error: Cannot dispose drink, no cups remaining (k=" + efsm.getK() + ")");
            op.ReturnCoins();
            op.ZeroCF();
            efsm.changeState(1);
        }
    }

    @Override
    public void additive(int a) {
        efsm.toggleAdditive(a);
        System.out.println("Toggled additive " + a + ". Current additives: " + Arrays.toString(efsm.getA()));
    }

    @Override
    public void coin(int f) {
        op.ReturnCoins();
    }
}
