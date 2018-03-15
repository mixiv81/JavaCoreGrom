package Lesson10.abstractOrder;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    void validateOrder() {
        String[] fromCity = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        String[] toCity = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        if (checkToCity(toCity) && checkFromCity(fromCity) && getBasePrice() >= 100 && getCustomerOwned().getGender().equals("Female")) {
            setDateConfirmed(new Date());
        }
    }


    @Override
    void calculatePrice() {
        String[] deliveryCity = {"Kiev", "Odessa"};
        double discount = 0.15;
        double priceWithDiscount = getBasePrice() - getBasePrice() * discount;
        double newPrice = getBasePrice() > 1000 ? priceWithDiscount - priceWithDiscount * 0.05 : priceWithDiscount;
        double priceWithDelivery = checkToCity(deliveryCity) ? newPrice + newPrice * 0.10 : newPrice + newPrice * 0.15;
        setTotalPrice(priceWithDelivery);
    }


}