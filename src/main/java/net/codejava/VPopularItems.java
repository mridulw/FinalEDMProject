package net.codejava;

public class VPopularItems {
    String restaurantName;
    String itemId;

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public VPopularItems(String restaurantName, String itemId) {
        this.restaurantName = restaurantName;
        this.itemId = itemId;
    }

    public VPopularItems() {
    }

    @Override
    public String toString() {
        return "{" +
            " restaurantName='" + getRestaurantName() + "'" +
            ", itemId='" + getItemId() + "'" +
            "}";
    }
    
}
