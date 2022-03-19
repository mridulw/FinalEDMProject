package net.codejava;

public class VOrderStats {
    String OrderDate;
    double OrdersToday;
    double WeekAgo;
    double PreviousDay;
    double WeeklyChange;
    double DailyChange;

    public String getOrderDate() {
        return this.OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public double getOrdersToday() {
        return this.OrdersToday;
    }

    public void setOrdersToday(double OrdersToday) {
        this.OrdersToday = OrdersToday;
    }

    public double getWeekAgo() {
        return this.WeekAgo;
    }

    public void setWeekAgo(double WeekAgo) {
        this.WeekAgo = WeekAgo;
    }

    public double getPreviousDay() {
        return this.PreviousDay;
    }

    public void setPreviousDay(double PreviousDay) {
        this.PreviousDay = PreviousDay;
    }

    public double getWeeklyChange() {
        return this.WeeklyChange;
    }

    public void setWeeklyChange(double WeeklyChange) {
        this.WeeklyChange = WeeklyChange;
    }

    public double getDailyChange() {
        return this.DailyChange;
    }

    public void setDailyChange(double DailyChange) {
        this.DailyChange = DailyChange;
    }

    public VOrderStats(String OrderDate, double OrdersToday, double WeekAgo, double PreviousDay, double WeeklyChange, double DailyChange) {
        this.OrderDate = OrderDate;
        this.OrdersToday = OrdersToday;
        this.WeekAgo = WeekAgo;
        this.PreviousDay = PreviousDay;
        this.WeeklyChange = WeeklyChange;
        this.DailyChange = DailyChange;
    }

    public VOrderStats() {
    }

    @Override
    public String toString() {
        return "{" +
            " OrderDate='" + getOrderDate() + "'" +
            ", OrdersToday='" + getOrdersToday() + "'" +
            ", WeekAgo='" + getWeekAgo() + "'" +
            ", PreviousDay='" + getPreviousDay() + "'" +
            ", WeeklyChange='" + getWeeklyChange() + "'" +
            ", DailyChange='" + getDailyChange() + "'" +
            "}";
    }


}
