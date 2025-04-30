package org.aghersi.StatePattern;

import org.aghersi.VendingMachines.EFSM;

/**
 * State 2: Idle state.
 */
public class State2 extends State {
    public State2(EFSM efsm, OutputProcessor op) {
        super(efsm, op);
    }

    @Override
    public void coin(int f) {
        if (f == 1) {   // Sufficient funds
            op.IncreaseCF();
            efsm.resetAdditives();
            efsm.changeState(3);
        } else {        // f == 0 (Insufficient funds)
            op.IncreaseCF();
        }
    }

    @Override
    public void card() {
        op.ZeroCF();
        efsm.resetAdditives();
        efsm.changeState(3);
    }

    @Override
    public void insert_cups(int n) {
        if (n > 0) {
            efsm.setK(efsm.getK() + n);
            System.out.println("Added " + n + " cups. Total cups: " + efsm.getK());
        } else {
            System.out.println("Cannot insert 0 or negative cups.");
        }
    }

    @Override
    public void set_price() {
        op.StorePrice();
    }

    @Override
    public void cancel() {
        System.out.println("Nothing to cancel in Idle state.");
    }
}
