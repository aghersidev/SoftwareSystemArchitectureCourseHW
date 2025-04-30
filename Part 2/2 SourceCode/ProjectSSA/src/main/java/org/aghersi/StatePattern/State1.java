package org.aghersi.StatePattern;

import org.aghersi.VendingMachines.EFSM;

/**
 * State 1: No Cups state.
 */
public class State1 extends State {
    public State1(EFSM efsm, OutputProcessor op) {
        super(efsm, op);
    }

    @Override
    public void insert_cups(int n) {
        if (n > 0) {
            efsm.setK(n);
            op.ZeroCF();
            efsm.changeState(2);
        } else {
            System.out.println("Cannot insert 0 or negative cups.");
        }
    }

    @Override
    public void coin(int f) {
        op.ReturnCoins();
    }

    @Override
    public void set_price() {
        op.StorePrice();
    }

}
