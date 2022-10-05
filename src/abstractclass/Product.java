package abstractclass;

/**
 * Abstract class Product that is used to create multiple
 * product types in the store
 */
public abstract class Product {

    //my variables
    private String productName;
    private double productPrice;

    private double discountPercent;

    //non-default constructor
    public Product(String productName, double productPrice, double discountPercent) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.discountPercent = discountPercent;
    }

    //my abstract method
    public abstract double calculateDiscountedPrice();
}
