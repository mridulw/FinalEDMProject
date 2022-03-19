package net.codejava;

import java.util.Date;

public class VRestLastOrderDate {
    String restaurantName;
    Date Last_Order_Date;


    public VRestLastOrderDate() {
    }

    public VRestLastOrderDate(String restaurantName, Date Last_Order_Date) {
        this.restaurantName = restaurantName;
        this.Last_Order_Date = Last_Order_Date;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Date getLast_Order_Date() {
        return this.Last_Order_Date;
    }

    public void setLast_Order_Date(Date Last_Order_Date) {
        this.Last_Order_Date = Last_Order_Date;
    }

    @Override
    public String toString() {
        return "{" +
            " restaurantName='" + getRestaurantName() + "'" +
            ", Last_Order_Date='" + getLast_Order_Date() + "'" +
            "}";
    }


}
