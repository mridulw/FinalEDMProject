package net.codejava;

public class VMostOrderedItems {
    String itemId;
    String restaurantId;
    String itemName;
    double itemCount;


    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCount() {
        return this.itemCount;
    }

    public void setItemCount(double itemCount) {
        this.itemCount = itemCount;
    }

    public VMostOrderedItems(String itemId, String restaurantId, String itemName, double itemCount) {
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

    public VMostOrderedItems() {
    }

    @Override
    public String toString() {
        return "{" +
            " itemId='" + getItemId() + "'" +
            ", restaurantId='" + getRestaurantId() + "'" +
            ", itemName='" + getItemName() + "'" +
            ", itemCount='" + getItemCount() + "'" +
            "}";
    }
    
    
}
