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
                if (toCities[i] == getGetShipToCity() && fromCities[k] == getShipFromSity() && getBasePrice() > 100 && getCustomerOwned().getGender() == "Female")
                    System.out.println("Ваш заказ " + getItemName() + ". Ваша гарантия " + guaranteeMonths + " месяца " + ". Дата подтверждения " + getDateConfirmed());
            }
        }
    }


    @Override
    void calculatePrice() {
        double discount = 0.15;
        double priceWithDiscount = getTotalPrice() + getBasePrice() - getBasePrice() * discount;
        double priceWithDelivery;
        if (getGetShipToCity() != "Kiev" || getGetShipToCity() != "Odessa") {
            priceWithDelivery = priceWithDiscount + (priceWithDiscount *0.15);
        } else {
            priceWithDelivery = priceWithDiscount + (priceWithDiscount *0.10);
        }
        double newPrice;
        if (getBasePrice() > 1000) {
            newPrice = priceWithDiscount - (priceWithDiscount* 0.05);
        }else {
            newPrice = priceWithDelivery;
        }
        setTotalPrice(newPrice);
        System.out.println("Стоимость Вашего заказа: " + getTotalPrice());
    }
}
