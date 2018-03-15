package Lesson10.abstractOrder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Ann", "Kiev", "Female");
        Customer customer1 = new Customer("Oleg", "Poltava", "Male");

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Iron", new Date(), "Kiev", "Kharkov", 1100, customer, 12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Washer", new Date(), "Kiev", "Poltava", 2300, customer1, 24);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Chair", new Date(), "Poltava", "Kiev", 5000, customer1, "CH50");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Table", new Date(), "Poltava", "Lvov", 250, customer, "TB250");

        electronicsOrder.validateOrder();
        System.out.println(electronicsOrder.getDateConfirmed());
        electronicsOrder.calculatePrice();
        System.out.println(electronicsOrder.getTotalPrice());
        electronicsOrder.confirmShipping();
        System.out.println(electronicsOrder.getDateShipped());




        furnitureOrder.validateOrder();
        System.out.println(furnitureOrder.getDateConfirmed());
        furnitureOrder.calculatePrice();
        System.out.println(furnitureOrder.getTotalPrice());
        furnitureOrder.calculatePrice();
        System.out.println(furnitureOrder.getDateShipped());



        electronicsOrder1.validateOrder();
        System.out.println(electronicsOrder1.getDateConfirmed());
        electronicsOrder1.calculatePrice();
        System.out.println(electronicsOrder1.getTotalPrice());
        electronicsOrder1.confirmShipping();
        System.out.println(electronicsOrder1.getDateShipped());


        furnitureOrder1.validateOrder();
        System.out.println(furnitureOrder1.getDateConfirmed());
        furnitureOrder1.calculatePrice();
        System.out.println(furnitureOrder1.getTotalPrice());
        furnitureOrder1.confirmShipping();
        System.out.println(furnitureOrder1.getDateShipped());

    }
}


