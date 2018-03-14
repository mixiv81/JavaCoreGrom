package Lesson10.abstractOrder;

import java.util.Date;

public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void validateOrder() {
        String[] fromCities = {"Kiev", "Lvov"};
        for (int i = 0; i < fromCities.length; i++) {
            if (fromCities[i] == getShipFromSity() && getBasePrice() > 500 && !getCustomerOwned().getName().equals("Test"))
                System.out.println("Ваш заказ " + getItemName() + ". Код " + furnitureCode + ". Дата подтверждения " + getDateConfirmed());
        }
    }


    @Override
    void calculatePrice() {
        double newPrice;
        if (getBasePrice() > 5000) {
            newPrice = getBasePrice() + (getBasePrice() * 0.5);
        } else {
            newPrice = getBasePrice() + (getBasePrice() * 0.5);
        }
        setTotalPrice(newPrice);
        System.out.println("Стоимость Вашего заказа: " + getTotalPrice());
    }
}

