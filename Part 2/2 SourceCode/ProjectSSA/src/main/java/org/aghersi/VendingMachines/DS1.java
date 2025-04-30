package org.aghersi.VendingMachines;

/**
 * Data Store for Vending Machine 1.
 */
public class DS1 extends DataStore {
    float temp_p; // Temporary price storage
    float temp_v; // Temporary coin value storage
    float price;  // Current price of a drink
    float cf;     // Cumulative funds inserted

    public float getPrice() {
        return price;
    }

    public float getCf() {
        return cf;
    }

    public float getTemp_v() {
        return temp_v;
    }

    public float getTemp_p() {
        return temp_p;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCf(float cf) {
        this.cf = cf;
    }
}
