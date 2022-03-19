package net.codejava;

public class VCustomerRestaurantOrder {
    String customerId;
    double totalnumber_of_orders;
    String restaurantId;


    public VCustomerRestaurantOrder() {
    }

    public VCustomerRestaurantOrder(String customerId, double totalnumber_of_orders, String restaurantId) {
        this.customerId = customerId;
        this.totalnumber_of_orders = totalnumber_of_orders;
        this.restaurantId = restaurantId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalnumber_of_orders() {
        return this.totalnumber_of_orders;
    }

    public void setTotalnumber_of_orders(double totalnumber_of_orders) {
        this.totalnumber_of_orders = totalnumber_of_orders;
    }

    public String getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        return "{" +
            " customerId='" + getCustomerId() + "'" +
            ", totalnumber_of_orders='" + getTotalnumber_of_orders() + "'" +
            ", restaurantId='" + getRestaurantId() + "'" +
            "}";
    }

}
