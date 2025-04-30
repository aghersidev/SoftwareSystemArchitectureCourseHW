package org.aghersi.StatePattern;

import org.aghersi.VendingMachines.EFSM;

/**
 * Abstract State class for the EFSM.
 */
public abstract class State {
    protected OutputProcessor op;
    protected EFSM efsm;

    public State(EFSM efsm, OutputProcessor op) {
        this.efsm = efsm;
        this.op = op;
    }

    public void create() {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void insert_cups(int n) {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void coin(int f) {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void card() {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void cancel() {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void set_price() {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void dispose_drink(int d) {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }

    public void additive(int a) {
        System.out.println("Invalid event in state " + this.getClass().getSimpleName());
    }
}
