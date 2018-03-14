package Lesson10.abstractOrder;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }


    @Override
    void validateOrder() {
        String[] fromCities = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        String[] toCities = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        for (int i = 0; i < fromCities.length; i++) {
            for (int k = 0; k < toCities.length; k++) {
                if (toCities[i] == getGetShipToCity() && fromCities[k] == getShipFromSity() && getBasePrice() > 100 && getCustomerOwned().getGender() == "Female") {
                    System.out.println("Ваш заказ " + getItemName() + ". Ваша гарантия " + guaranteeMonths + " месяца " + ". Дата подтверждения " + getDateConfirmed());
                } else
                    System.out.println("Извините, вы не можете сделать заказ");
                break;
            }
        }
    }


    @Override
    void calculatePrice() {
        double priceShip = 10.5;
        double discount = 0.15;
        double newPrice = getTotalPrice() + getBasePrice() + priceShip + discount;
        setTotalPrice(newPrice);
        System.out.println("Стоимость Вашего заказа: " + getTotalPrice());
    }
}
