package Lesson10.abstractOrder;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Ann", "Kiev", "Female");
        Customer customer1 = new Customer("Oleg", "Poltava", "Male");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Iron", "Kiev", "Kharkov", 1100, customer, 12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Washer", "Kiev", "Poltava", 2300, customer1, 24);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Chair", "Kiev", "Kiev", 5000, customer1, "CH50");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Table", "Kharkov", "Lvov", 250, customer, "TB250");

        start(electronicsOrder);
        start(furnitureOrder);
    }
static void start(Order order){
        order.validateOrder();
        order.calculatePrice();


}
}

