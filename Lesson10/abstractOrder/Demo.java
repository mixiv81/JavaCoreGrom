package Lesson10.abstractOrder;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Ann", "Kiev", "Female");
        Customer customer1 = new Customer("Oleg", "Poltava", "Male");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Iron", "Kiev", "Kharkov", 1000, customer, 12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Washer", "Kiev", "Poltava", 2300, customer1, 24);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Chair", "Kiev", "Dnepr", 50, customer1, "CH50");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Table", "Kharkov", "Lvov", 250, customer, "TB250");

        electronicsOrder.validateOrder();
       // electronicsOrder1.validateOrder();


        // electronicsOrder.calculatePrice();

    }

}

