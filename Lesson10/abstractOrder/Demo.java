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
        electronicsOrder.calculatePrice();
        electronicsOrder.confirmShipping();

        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();
        furnitureOrder.confirmShipping();

        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();
    }
}


