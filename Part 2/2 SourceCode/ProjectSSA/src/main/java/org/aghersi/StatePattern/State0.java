package org.aghersi.StatePattern;

import org.aghersi.VendingMachines.EFSM;

/**
 * State 0: Start state.
 */
public class State0 extends State {
    public State0(EFSM efsm, OutputProcessor op) {
        super(efsm, op);
    }

    @Override
    public void create() {
        op.StorePrice();
        op.ZeroCF();
        efsm.setK(0);
        efsm.changeState(1);
    }
}
