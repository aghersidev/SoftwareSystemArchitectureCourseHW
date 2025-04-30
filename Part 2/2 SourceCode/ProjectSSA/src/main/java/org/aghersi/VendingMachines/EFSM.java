package org.aghersi.VendingMachines;

import org.aghersi.StatePattern.*;
import org.aghersi.StatePattern.OutputProcessor;

import java.util.Arrays;

/**
 * The Extended Finite State Machine.
 */
public class EFSM {
    private State[] states;
    private State currentState;
    private int k;                  // Number of cups available
    private int[] A;                // Array to track selected additives (A[1]=1 means additive 1 selected)
    private static final int MAX_ADDITIVES = 3; // 0: unused, 1: sugar(VM1)/cream(VM2), 2: sugar(VM2)

    public EFSM(OutputProcessor op) {
        this.A = new int[MAX_ADDITIVES];
        states = new State[]{
                new State0(this, op),
                new State1(this, op),
                new State2(this, op),
                new State3(this, op)
        };
        currentState = states[0];
        System.out.println("EFSM Initialized. Current State: " + currentState.getClass().getSimpleName());
    }

    public void changeState(int stateIndex) {
        if (stateIndex >= 0 && stateIndex < states.length) {
            currentState = states[stateIndex];
            System.out.println("EFSM: State changed to -> " + currentState.getClass().getSimpleName());
        } else {
            System.err.println("Error: Invalid state index " + stateIndex);
        }
    }

    public void create() {
        System.out.println("EFSM Event: create()");
        currentState.create();
    }

    public void insert_cups(int n) {
        System.out.println("EFSM Event: insert_cups(n=" + n + ")");
        currentState.insert_cups(n);
    }

    public void coin(int f) {
        System.out.println("EFSM Event: coin(f=" + f + ")");
        currentState.coin(f);
    }

    public void card() {
        System.out.println("EFSM Event: card()");
        currentState.card();
    }

    public void cancel() {
        System.out.println("EFSM Event: cancel()");
        currentState.cancel();
    }

    public void set_price() {
        System.out.println("EFSM Event: set_price()");
        currentState.set_price();
    }

    public void dispose_drink(int d) {
        System.out.println("EFSM Event: dispose_drink(d=" + d + ")");
        currentState.dispose_drink(d);
    }

    public void additive(int a) {
        System.out.println("EFSM Event: additive(a=" + a + ")");
        currentState.additive(a);
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
        System.out.println("EFSM: Cups k set to " + this.k);
    }

    public int[] getA() {
        return A;
    }

    public void resetAdditives() {
        Arrays.fill(A, 0);
        System.out.println("EFSM: Additives A reset to " + Arrays.toString(A));
    }

    public void toggleAdditive(int additiveIndex) {
        if (additiveIndex >= 0 && additiveIndex < A.length) {
            A[additiveIndex] = 1 - A[additiveIndex];
        } else {
            System.err.println("Error: Invalid additive index " + additiveIndex);
        }
    }

    public String getCurrentStateName() {
        return currentState.getClass().getSimpleName();
    }
}
