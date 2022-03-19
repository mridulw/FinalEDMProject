package net.codejava;

public class vItemType {
    String Restaurant_Name;
    double High_Priced;
    String High_Revenue_Price;
    double Low_Priced;
    String Low_Revenue_Price;
    String Percent_High_price_Revenue;

    public String getRestaurant_Name() {
        return this.Restaurant_Name;
    }

    public void setRestaurant_Name(String Restaurant_Name) {
        this.Restaurant_Name = Restaurant_Name;
    }

    public double getHigh_Priced() {
        return this.High_Priced;
    }

    public void setHigh_Priced(double High_Priced) {
        this.High_Priced = High_Priced;
    }

    public String getHigh_Revenue_Price() {
        return this.High_Revenue_Price;
    }

    public void setHigh_Revenue_Price(String High_Revenue_Price) {
        this.High_Revenue_Price = High_Revenue_Price;
    }

    public double getLow_Priced() {
        return this.Low_Priced;
    }

    public void setLow_Priced(double Low_Priced) {
        this.Low_Priced = Low_Priced;
    }

    public String getLow_Revenue_Price() {
        return this.Low_Revenue_Price;
    }

    public void setLow_Revenue_Price(String Low_Revenue_Price) {
        this.Low_Revenue_Price = Low_Revenue_Price;
    }

    public String getPercent_High_price_Revenue() {
        return this.Percent_High_price_Revenue;
    }

    public void setPercent_High_price_Revenue(String Percent_High_price_Revenue) {
        this.Percent_High_price_Revenue = Percent_High_price_Revenue;
    }

    public vItemType() {
    }

    public vItemType(String Restaurant_Name, double High_Priced, String High_Revenue_Price, double Low_Priced, String Low_Revenue_Price, String Percent_High_price_Revenue) {
        this.Restaurant_Name = Restaurant_Name;
        this.High_Priced = High_Priced;
        this.High_Revenue_Price = High_Revenue_Price;
        this.Low_Priced = Low_Priced;
        this.Low_Revenue_Price = Low_Revenue_Price;
        this.Percent_High_price_Revenue = Percent_High_price_Revenue;
    }

    @Override
    public String toString() {
        return "{" +
            " Restaurant_Name='" + getRestaurant_Name() + "'" +
            ", High_Priced='" + getHigh_Priced() + "'" +
            ", High_Revenue_Price='" + getHigh_Revenue_Price() + "'" +
            ", Low_Priced='" + getLow_Priced() + "'" +
            ", Low_Revenue_Price='" + getLow_Revenue_Price() + "'" +
            ", Percent_High_price_Revenue='" + getPercent_High_price_Revenue() + "'" +
            "}";
    }
    
}
