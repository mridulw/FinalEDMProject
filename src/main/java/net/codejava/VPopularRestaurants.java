package net.codejava;

public class VPopularRestaurants {
    String restaurantId;
    double revenue;
    double popularity;

    public String getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getPopularity() {
        return this.popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "{" +
            " restaurantId='" + getRestaurantId() + "'" +
            ", revenue='" + getRevenue() + "'" +
            ", popularity='" + getPopularity() + "'" +
            "}";
    }

    public VPopularRestaurants(String restaurantId, double revenue, double popularity) {
        this.restaurantId = restaurantId;
        this.revenue = revenue;
        this.popularity = popularity;
    }

    public VPopularRestaurants() {
    }

}

