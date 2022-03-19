package net.codejava;


public class VCustStats {
    String customerId;
    double totalOrders;
    double totalAmountSpent; 


    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalOrders() {
        return this.totalOrders;
    }

    public void setTotalOrders(double totalOrders) {
        this.totalOrders = totalOrders;
    }

    public double getTotalAmountSpent() {
        return this.totalAmountSpent;
    }

    public void setTotalAmountSpent(double totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    public VCustStats() {
    }


    public VCustStats(String customerId, double totalOrders, double totalAmountSpent) {
        this.customerId = customerId;
        this.totalOrders = totalOrders;
        this.totalAmountSpent = totalAmountSpent;
    }


}
