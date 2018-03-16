package Lesson10.abstractOrder;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    protected void validateOrder() {
        String[] fromCity = {"Kiev", "Lvov"};
        if (checkFromCity(fromCity) && getBasePrice() >= 500 && !getCustomerOwned().getName().equals("Test")) {
            setDateConfirmed(new Date());
        }
    }

    @Override
   protected void calculatePrice() {
        setTotalPrice(getBasePrice() > 5000 ? getBasePrice() * 1.02 : getBasePrice() * 1.05);
    }
}