package org.aghersi.VendingMachines;

import org.aghersi.AbstractFactoryPattern.AbstractFactory;
import org.aghersi.StatePattern.OutputProcessor;

import java.util.Arrays;

/**
 * Vending Machine 1 implementation.
 */
public class VM1 {
    private EFSM m;
    private DS1 d;

    public VM1(AbstractFactory af) {
        this.d = (DS1) af.createDataStore(); // Get the DS1 instance from the factory
        OutputProcessor op = new OutputProcessor(af); // Create OP using the factory
        this.m = new EFSM(op);
        System.out.println("\n--- VM1 Created ---");
    }

    public void create(float p) {
        System.out.println("\nVM1 Operation: create(p=" + p + ")");
        if (p > 0) {
            d.temp_p = p; // Store price temporarily in DS
            m.create();
        } else {
            System.out.println("VM1 Error: Price must be positive.");
        }
    }

    public void coin(float v) {
        System.out.println("VM1 Operation: coin(v=" + v + ")");
        if (v > 0) {
            d.temp_v = v; // Store coin value temporarily in DS
            // Check condition for EFSM coin event (f=1 sufficient, f=0 insufficient)
            if (d.cf + v >= d.price) {
                m.coin(1);
            } else {
                m.coin(0);
            }
        } else {
            System.out.println("VM1 Error: Coin value must be positive.");
        }
    }

    public void card(float x) {
        System.out.println("VM1 Operation: card(x=" + x + ")");
        // Check condition (payment covers price)
        if (x >= d.price) {
            m.card();
        } else {
            System.out.println("VM1 Info: Card payment (" + x + ") is less than price (" + d.price + "). Transaction declined.");
        }
    }

    public void sugar() {
        System.out.println("VM1 Operation: sugar()");
        // VM1: sugar corresponds to additive ID 1
        m.additive(1);
    }

    public void cappuccino() {
        System.out.println("VM1 Operation: cappuccino()");
        // VM1: cappuccino corresponds to drink ID 1
        m.dispose_drink(1);
    }

    public void chocolate() {
        System.out.println("VM1 Operation: chocolate()");
        // VM1: chocolate corresponds to drink ID 2
        m.dispose_drink(2);
    }

    public void insert_cups(int n) {
        System.out.println("VM1 Operation: insert_cups(n=" + n + ")");
        m.insert_cups(n);
    }

    public void set_price(float p) {
        System.out.println("VM1 Operation: set_price(p=" + p + ")");
        if (p > 0) {
            d.temp_p = p; // Store price temporarily in DS
            m.set_price();
        } else {
            System.out.println("VM1 Error: Price must be positive.");
        }
    }

    public void cancel() {
        System.out.println("VM1 Operation: cancel()");
        m.cancel();
    }

    public void showState() {
        System.out.println("VM1 Current State: " + m.getCurrentStateName() +
                ", Cups(k): " + m.getK() +
                ", CF: " + d.getCf() +
                ", Price: " + d.getPrice() +
                ", Additives(A): " + Arrays.toString(m.getA()));
    }
}
