import interfaces.ProductPrice;
import myclasses.RobotBear;
import myclasses.TeddyBear;

import java.text.CharacterIterator;

/**
 * Java Program that shows the differences between Abstract class and Interface
 * with additional use of a Marker interface
 * and an example of functional interface.
 *
 * @author Kgotso Matjato
 */
public class Main {
    public static void main(String[] args)
    {
        //creating the Teddy Bear object of type Product
       TeddyBear teddyBear = new TeddyBear("Brown Teddy", 250.00, 0.13);

        //Marker interface example
        //checking if a specific product is rechargeable or not
        if(teddyBear instanceof CharacterIterator)
        {
            System.out.println("This is a rechargeable product");
        }
        else {
            System.out.println("This is not a rechargeable product");
        }

       //accessing the created object properties
       System.out.println("Description: " + teddyBear.getTeddyDescription());
       System.out.println("Original Price: R" + teddyBear.getTeddyPrice());
       System.out.println("Discount Percent: " + teddyBear.getDiscountPercentage() * 100 + "%");

       System.out.println("Discounted price is: R" + teddyBear.calculateDiscountedPrice());
       System.out.println();

        //creating the Robot Bear object of type Product
        RobotBear robotBear = new RobotBear();

        robotBear.powerOn();
        robotBear.remoteControl();
        robotBear.charge();

        //functional interface example
//        double price = robotBear.setPrice(450.00);
//        ProductPrice lambdaProductPrice = () -> System.out.println("Product Price is: R"  + price);
//
//        ProductPrice innerClassProductPrice = new ProductPrice() {
//            @Override
//            public void setProductPrice() {
//                double newPrice = robotBear.setPrice(560.00);
//            }
//        };
//
//        robotBear.getPrice(() -> System.out.println("New robot bear price is: R" + price);
//        robotBear.getPrice(innerClassProductPrice);
    }
}