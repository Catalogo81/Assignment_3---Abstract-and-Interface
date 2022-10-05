package myclasses;

import interfaces.ChargeableProduct;
import interfaces.ElectricProduct;

public class RobotBear implements ElectricProduct, ChargeableProduct {

    private double price;

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    @Override
    public void powerOn() {
        System.out.println("In order to power on the Robot, press the 'On' button");
        System.out.println("In order to power off the Robot, press the 'Off' button");
    }

    @Override
    public void charge() {
        System.out.println("Charge using a C-Type charger");
    }

    @Override
    public void remoteControl() {
        System.out.println("Remote control guide is attached to the box");
    }
}
