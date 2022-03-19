package net.codejava;
public class Restaurant {
    private String restaurantID;
    private String restaurantName;
    

    public Restaurant() {
    }

    public Restaurant(String restaurantID, String restaurantName) {
        this.restaurantID = restaurantID;
        this.restaurantName = restaurantName;
    }

    public String getRestaurantID() {
        return this.restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String toString() {
        return "{" +
            " restaurantID='" + getRestaurantID() + "'" +
            ", restaurantName='" + getRestaurantName() + "'" +
            "}";
    }

}