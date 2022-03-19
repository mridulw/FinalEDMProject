package net.codejava;

public class VRiderRank {
    String rider;
    double totalNumber_of_rides;
    double average_rating;
    double rider_rank;

    public String getRider() {
        return this.rider;
    }

    public void setRider(String rider) {
        this.rider = rider;
    }

    public double getTotalNumber_of_rides() {
        return this.totalNumber_of_rides;
    }

    public void setTotalNumber_of_rides(double totalNumber_of_rides) {
        this.totalNumber_of_rides = totalNumber_of_rides;
    }

    public double getAverage_rating() {
        return this.average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public double getRider_rank() {
        return this.rider_rank;
    }

    public void setRider_rank(double rider_rank) {
        this.rider_rank = rider_rank;
    }

    public VRiderRank(String rider, double totalNumber_of_rides, double average_rating, double rider_rank) {
        this.rider = rider;
        this.totalNumber_of_rides = totalNumber_of_rides;
        this.average_rating = average_rating;
        this.rider_rank = rider_rank;
    }

    public VRiderRank() {
    }

    @Override
    public String toString() {
        return "{" +
            " rider='" + getRider() + "'" +
            ", totalNumber_of_rides='" + getTotalNumber_of_rides() + "'" +
            ", average_rating='" + getAverage_rating() + "'" +
            ", rider_rank='" + getRider_rank() + "'" +
            "}";
    }

}
