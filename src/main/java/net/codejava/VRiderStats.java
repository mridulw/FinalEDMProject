package net.codejava;

public class VRiderStats {
    String deliveryAgentId;
    double Total_revenue;
    double Numberoforders;


    public VRiderStats() {
    }

    public VRiderStats(String deliveryAgentId, double Total_revenue, double Numberoforders) {
        this.deliveryAgentId = deliveryAgentId;
        this.Total_revenue = Total_revenue;
        this.Numberoforders = Numberoforders;
    }

    public String getDeliveryAgentId() {
        return this.deliveryAgentId;
    }

    public void setDeliveryAgentId(String deliveryAgentId) {
        this.deliveryAgentId = deliveryAgentId;
    }

    public double getTotal_revenue() {
        return this.Total_revenue;
    }

    public void setTotal_revenue(double Total_revenue) {
        this.Total_revenue = Total_revenue;
    }

    public double getNumberoforders() {
        return this.Numberoforders;
    }

    public void setNumberoforders(double Numberoforders) {
        this.Numberoforders = Numberoforders;
    }

    @Override
    public String toString() {
        return "{" +
            " deliveryAgentId='" + getDeliveryAgentId() + "'" +
            ", Total_revenue='" + getTotal_revenue() + "'" +
            ", Numberoforders='" + getNumberoforders() + "'" +
            "}";
    }

    
}
