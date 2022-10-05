package myclasses;

import abstractclass.Product;
import interfaces.ChargeableProduct;

/**
 * subclass TeddyBear that extends Product
 * by extending the Product superclass, the TeddyBear class will automatically
 * inherit the Products abstract methods
 */
public class TeddyBear extends Product {

    //my variables
    private double discountPercentage;
    private String teddyDescription;
    private double teddyPrice;

    //non-default constructor
    public TeddyBear(String productName, double productPrice, double discountPercent) {
        super(productName, productPrice, discountPercent);

        this.discountPercentage = discountPercent;
        this.teddyPrice = productPrice;
        this.teddyDescription = productName;
    }

    //getters and setters for accessing the properties
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getTeddyDescription() {
        return teddyDescription;
    }

    public void setTeddyDescription(String teddyDescription) {
        this.teddyDescription = teddyDescription;
    }

    public double getTeddyPrice() {
        return teddyPrice;
    }

    public void setTeddyPrice(double teddyPrice) {
        this.teddyPrice = teddyPrice;
    }

    //override method from my abstract class
    @Override
    public double calculateDiscountedPrice() {

        teddyPrice = teddyPrice - (teddyPrice * discountPercentage);

        return teddyPrice;
    }
}
