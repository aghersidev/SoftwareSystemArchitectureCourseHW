package org.aghersi.VendingMachines;

import org.aghersi.AbstractFactoryPattern.AbstractFactory;
import org.aghersi.StatePattern.OutputProcessor;

import java.util.Arrays;

/**
 * Vending Machine 2 implementation.
 */
public class VM2 {
    private EFSM m;
    private DS2 d;

    public VM2(AbstractFactory af2) {
        this.d = (DS2) af2.createDataStore(); // Get the DS2 instance from the factory
        OutputProcessor op = new OutputProcessor(af2); // Create OP using the factory
        this.m = new EFSM(op);
        System.out.println("\n--- VM2 Created ---");
    }

    public void CREATE(int p) {
        System.out.println("\nVM2 Operation: CREATE(p=" + p + ")");
        if (p > 0) {
            d.temp_p = p; // Store price temporarily in DS
            m.create();
        } else {
            System.out.println("VM2 Error: Price must be positive.");
        }
    }

    public void COIN(int v) {
        System.out.println("VM2 Operation: COIN(v=" + v + ")");
        if (v > 0) {
            d.temp_v = v; // Store coin value temporarily in DS
            // Check condition for EFSM coin event (f=1 sufficient, f=0 insufficient)
            if (d.cf + v >= d.price) {
                m.coin(1);
            } else {
                m.coin(0);
            }
        } else {
            System.out.println("VM2 Error: Coin value must be positive.");
        }
    }

    public void SUGAR() {
        System.out.println("VM2 Operation: SUGAR()");
        // VM2: sugar corresponds to additive ID 2
        m.additive(2);
    }

    public void CREAM() {
        System.out.println("VM2 Operation: CREAM()");
        // VM2: cream corresponds to additive ID 1
        m.additive(1);
    }

    public void COFFEE() {
        System.out.println("VM2 Operation: COFFEE()");
        // VM2: coffee corresponds to drink ID 1
        m.dispose_drink(1);
    }

    public void InsertCups(int n) {
        System.out.println("VM2 Operation: InsertCups(n=" + n + ")");
        m.insert_cups(n);
    }

    public void SetPrice(int p) {
        System.out.println("VM2 Operation: SetPrice(p=" + p + ")");
        if (p > 0) {
            d.temp_p = p; // Store price temporarily in DS
            m.set_price();
        } else {
            System.out.println("VM2 Error: Price must be positive.");
        }
    }

    public void CANCEL() {
        System.out.println("VM2 Operation: CANCEL()");
        m.cancel();
    }

    public void showState() {
        System.out.println("VM2 Current State: " + m.getCurrentStateName() +
                ", Cups(k): " + m.getK() +
                ", CF: " + d.getCf() +
                ", Price: " + d.getPrice() +
                ", Additives(A): " + Arrays.toString(m.getA()));
    }
}
