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
        String[] cities = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        int minPrice = 100;
        String gender = "Female";
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] == getCustomerOwned().getCity() && getBasePrice() > minPrice && getCustomerOwned().getGender() == gender) {
                System.out.println("Ваш заказ " + getItemName() + " код " + furnitureCode + ". Дата подтверждения " + getDateConfirmed());
                break;
            }
            else
                System.out.println("Извините, вы не можете сделать заказ");
            break;
        }
    }

    @Override
    void calculatePrice() {

    }
}
