package org.aghersi.VendingMachines;

/**
 * Data Store for Vending Machine 2.
 */
public class DS2 extends DataStore {
    int temp_p; // Temporary price storage
    int temp_v; // Temporary coin value storage
    int price;  // Current price of a drink
    int cf;     // Cumulative funds inserted

    public int getPrice() {
        return price;
    }

    public int getCf() {
        return cf;
    }

    public int getTemp_v() {
        return temp_v;
    }

    public int getTemp_p() {
        return temp_p;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }
}
