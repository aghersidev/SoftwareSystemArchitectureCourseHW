package org.aghersi;

import org.aghersi.AbstractFactoryPattern.AbstractFactory;
import org.aghersi.AbstractFactoryPattern.ConcreteFactory1;
import org.aghersi.AbstractFactoryPattern.ConcreteFactory2;
import org.aghersi.VendingMachines.VM1;
import org.aghersi.VendingMachines.VM2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n\n\nSCENARIO 1");
        AbstractFactory af = new ConcreteFactory1();
        VM1 vm1 = new VM1(af);

        // Scenario 1
        vm1.create(2.5f);
        vm1.insert_cups(20);
        vm1.card(7.2f);
        vm1.sugar();
        vm1.cappuccino();

        System.out.println("\n\n\nSCENARIO 2");
        AbstractFactory af2 = new ConcreteFactory2();
        VM2 vm2 = new VM2(af2);

        // Scenario 2
        vm2.CREATE(2);
        vm2.InsertCups(1);
        vm2.COIN(1);
        vm2.COIN(1);
        vm2.CREAM();
        vm2.COFFEE();

    }
}
