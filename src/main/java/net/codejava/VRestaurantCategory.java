package net.codejava;

public class VRestaurantCategory {
    String restaurantId;
    String restaurantName;
    String Restaurant_Category;


    public VRestaurantCategory() {
    }

    public VRestaurantCategory(String restaurantId, String restaurantName, String Restaurant_Category) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.Restaurant_Category = Restaurant_Category;
    }

    public String getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurant_Category() {
        return this.Restaurant_Category;
    }

    public void setRestaurant_Category(String Restaurant_Category) {
        this.Restaurant_Category = Restaurant_Category;
    }

    @Override
    public String toString() {
        return "{" +
            " restaurantId='" + getRestaurantId() + "'" +
            ", restaurantName='" + getRestaurantName() + "'" +
            ", Restaurant_Category='" + getRestaurant_Category() + "'" +
            "}";
    }

}
