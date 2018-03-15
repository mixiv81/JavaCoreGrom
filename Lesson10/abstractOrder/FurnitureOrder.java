package Lesson10.abstractOrder;

import java.util.Date;

public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        String[] fromCity = {"Kiev", "Lvov"};
        if (checkFromCity(fromCity) && getBasePrice() >= 500 && !getCustomerOwned().getName().equals("Test")) {
            setDateConfirmed(new Date());
        }
    }

    @Override
    void calculatePrice() {
        double newPrice = getBasePrice() > 5000 ? getBasePrice() + getBasePrice() * 0.02 : getBasePrice() + getBasePrice() * 0.05;
        setTotalPrice(newPrice);
    }
}