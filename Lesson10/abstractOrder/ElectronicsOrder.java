package Lesson10.abstractOrder;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String ShipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, ShipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    protected void validateOrder() {
        String[] fromCity = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        String[] toCity = {"Kiev", "Odessa", "Dnepr", "Kharkov"};
        if (checkFromCity(fromCity)&& checkToCity(toCity) && getBasePrice() >= 100 && getCustomerOwned().getGender().equals("Female")) {
            setDateConfirmed(new Date());
        }
    }


    @Override
    protected void calculatePrice() {
        String[] deliveryCity = {"Kiev", "Odessa"};
        double priceDelivery = checkToCity(deliveryCity) ? getBasePrice() * 0.10 : getBasePrice() * 0.15;
        double priceWithDiscount = getBasePrice() > 1000 ? getBasePrice() - getBasePrice() * 0.05 : getBasePrice();
        setTotalPrice(priceDelivery + priceWithDiscount);
    }
}