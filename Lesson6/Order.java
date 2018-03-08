package Lesson6;

import java.util.Date;

public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    void confirmOrder() {
        isConfirmed = true;
        dateConfirmed = new Date();
    }

    boolean checkPrice() {
        boolean priceDeal = price > 1000 ? true : false;
        return priceDeal;
    }

    boolean isValidType() {
        String buy = "Buy";
        String sale = "Sale";
        if (buy == type)
            return true;
        if (sale == type)
            return true;
        else
            return false;
    }
}
